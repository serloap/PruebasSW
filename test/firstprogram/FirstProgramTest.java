/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprogram;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergio
 */
public class FirstProgramTest {
    
    public FirstProgramTest() {
    }

    /*
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        FirstProgram.main(args);
        fail("The test case is a prototype.");
    }
    */

    @Test
    public void testIsNumber() {
        System.out.println("isNumber");
        String string = "123";
        boolean expResult = true;
        boolean result = FirstProgram.isNumber(string);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testIsNotNumber() {
        System.out.println("isNotNumber");
        String string = "ab- #3";
        boolean expResult = false;
        boolean result = FirstProgram.isNumber(string);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    /*
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        List<Double> list = new ArrayList<>();
        list.add(160.0);
        list.add(591.0);
        list.add(114.0);
        list.add(229.0);
        list.add(230.0);
        list.add(270.0);
        list.add(128.0);
        list.add(1657.0);
        list.add(624.0);
        list.add(1503.0);
        FirstProgram.calculate(list);
    }
    */

    /*@Test
    public void testShowList() {
        System.out.println("showList");
        List list = null;
        FirstProgram.showList(list);
        fail("The test case is a prototype.");
    }*/

    @Test
    public void testGetMean() {
        System.out.println("getMean");      
        List<Double> list = new ArrayList<>();
        list.add(160.0);
        list.add(591.0);
        list.add(114.0);
        list.add(229.0);
        list.add(230.0);
        list.add(270.0);
        list.add(128.0);
        list.add(1657.0);
        list.add(624.0);
        list.add(1503.0);
        double expResult = 550.6;
        double result = FirstProgram.getMean(list);
        assertEquals(expResult, result, 1);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetStd() {
        System.out.println("getStd");
        List<Double> list = new ArrayList<>();
        list.add(15.0);
        list.add(69.9);
        list.add(6.5);
        list.add(22.4);
        list.add(28.4);
        list.add(65.9);
        list.add(19.4);
        list.add(198.7);
        list.add(38.8);
        list.add(138.2);
        double mean = FirstProgram.getMean(list);
        double expResult = 62.26;
        double result = FirstProgram.getStd(list, mean);
        assertEquals(expResult, result, 1);
        //fail("The test case is a prototype.");
    }
    
}
