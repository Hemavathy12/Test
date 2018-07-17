/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addition;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author I20869
 */
public class AdditionTest {
    Addition add=new Addition();
    public AdditionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Add method, of class Addition.
     */
    @Test
    public void testAdd() {
        int NUM_1 = 22;
        int NUM_2 = 20;
        int result = Addition.Add(NUM_1, NUM_2);
        int expected_result=42;
        assertEquals(result,expected_result);
    }
     /**
     * Test of Add method, of class Addition.
     */
    @Test
    public void testAdd_1() {
        int NUM_1 = 220;
        int NUM_2 = 20;
        int result = Addition.Add(NUM_1, NUM_2);
        int expected_result=42;
        assertNotEquals(result,expected_result);
    }
     /**
     * Test of Add method, of class Addition.
     */
    @Test
    public void testAdd_2() {
        int NUM_1 = 22;
        int NUM_2 = -2;
        int result = Addition.Add(NUM_1, NUM_2);
        int expected_result=20;
        assertEquals(result,expected_result);
    }
     /**
     * Test of Add method, of class Addition.
     */
    @Test
    public void testAdd_3() {
        int NUM_1 = 200;
        int NUM_2 = 20;
        int result = Addition.Add(NUM_1, NUM_2);
        int expected_result=123;
        assertNotEquals(result,expected_result);
    }
     /**
     * Test of Add method, of class Addition.
     */
    @Test
    public void testAdd_4() {
        int NUM_1 = 1;
        int NUM_2 = 20;
        int result = Addition.Add(NUM_1, NUM_2);
        int expected_result=21;
        assertEquals(result,expected_result);
    }
     /**
     * Test of Add method, of class Addition.
     */
    @Test
    public void testAdd_6() {
        int NUM_1 = 1000;
        int NUM_2 = 20;
        int result = Addition.Add(NUM_1, NUM_2);
        int expected_result=1020;
        assertEquals(result,expected_result);
    }
     /**
     * Test of Add method, of class Addition.
     */
    @Test
    public void testAdd_7() {
        int NUM_1 = 10;
        int NUM_2 = 56;
        int result = Addition.Add(NUM_1, NUM_2);
        int expected_result=66;
        assertEquals(result,expected_result);
    }
    
}
