/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprogram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Sergio
 */
public class FirstProgram {

    /**
     * @param args the command line arguments
     */
    
    private static List<Double> list;
    private static Iterator<Double> iterator;
    
    public static void main(String[] args) throws IOException {          
        list=new ArrayList<>();        
        Boolean exit=false;        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert number, write C to calculate or E to exit");      
        while(!exit)
        {
            String input = br.readLine();
            if(input.equalsIgnoreCase("e"))
            {
                exit=true;
            }
            else if(input.equalsIgnoreCase("c"))
            {
                calculate(list);
                exit=true;
            }
            else if(FirstProgram.isNumber(input))
            {
                list.add(Double.parseDouble(input));
                showList(list);
                System.out.println("Insert number, write C to calculate or E to exit");
            }            
            else
            {
                System.out.println("Enter a number: ");
            }         
        }        
    }  
    
    public static boolean isNumber(String string) {
        try {
            Double.parseDouble(string);            
        } catch (Exception e) {
            return false;
        }       
        return true;
    }

    public static void calculate(List list){
        double mean=getMean(list);
        double std=getStd(list, mean);
        System.out.println("Mean: " + mean);
        System.out.println("Std: " + std);
        System.out.println("Press any key to exit");
    }
    
    public static void showList(List list) 
    {
        iterator=list.iterator();
        System.out.println("List: ");
        while(iterator.hasNext())
        {                         
            System.out.println(iterator.next());                
        }     
    }

    public static double getMean(List list)
    {
        int n = list.size();
        double mean=0;        
        iterator=list.iterator();
        while(iterator.hasNext())
        {                         
            mean=mean+iterator.next();                
        }
        mean=mean/n;
        return mean;
    }

    public static double getStd(List list, double mean)
    {
        int n = list.size();
        double std=0;
        iterator=list.iterator();
        while(iterator.hasNext())
        {  
            std=std+Math.pow(iterator.next()-mean, 2);                
        }
        std=Math.sqrt(std/(n-1));
        return std;
    }

}
