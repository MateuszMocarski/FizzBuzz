/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Mateusz
 */
public class FizzBuzzTest {
    
    public FizzBuzzTest() {
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

    @Test
    public void by3DividerReturningFizz(){
        Assert.assertEquals("Fizz", FizzBuzz.Divider(3));
        Assert.assertEquals("Fizz", FizzBuzz.Divider(6));
        Assert.assertEquals("Fizz", FizzBuzz.Divider(9));
        Assert.assertEquals("Fizz", FizzBuzz.Divider(12));
        Assert.assertNotEquals("Fizz", FizzBuzz.Divider(15));
    }
    
    @Test
    public void by5DividerReturningBuzz(){
        Assert.assertEquals("Buzz", FizzBuzz.Divider(5));
        Assert.assertEquals("Buzz", FizzBuzz.Divider(10));
        Assert.assertNotEquals("Buzz", FizzBuzz.Divider(15));
        Assert.assertEquals("Buzz", FizzBuzz.Divider(20));
        Assert.assertEquals("Buzz", FizzBuzz.Divider(25));
    }
    
    @Test
    public void by15DividerReturningFizzBuzz(){
        Assert.assertEquals("FizzBuzz", FizzBuzz.Divider(15));
        Assert.assertEquals("FizzBuzz", FizzBuzz.Divider(30));
        Assert.assertEquals("FizzBuzz", FizzBuzz.Divider(45));
        Assert.assertEquals("FizzBuzz", FizzBuzz.Divider(60));
        Assert.assertNotEquals("FizzBuzz", FizzBuzz.Divider(61));
    }
    
}
