package com.Sorokin;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class TestNGDemo {
    @BeforeSuite
    public  void beforeSuite(){
        System.out.println("Before Suite");
    }
    @BeforeTest
    public  void beforeTest(){
        System.out.println("Before Test");
    }
    @BeforeClass
    public  void beforeClass(){
        System.out.println("Before Class");
    }
    @BeforeMethod
    public  void setup(){
        System.out.println("Before method");
    }
    @Test(priority = 3)
    public void test1(){
        String word1 = "Mixa";
        String word2 = "Mixa";
        System.out.println("Test1");
        Assert.assertEquals(word1, word2);

    }

    @Test(priority = 2)
    public void test2() {
        String word1 = "Mixa";
        String word2 = "Mixa";
        System.out.println("Test2");
        Assert.assertEquals(word1, word2);

    }
    @Test(priority = 4)
    public void test3() {
        String word1 = "Mixa";
        String word2 = "Mixa";
        System.out.println("Test3");
        Assert.assertEquals(word1, word2);
        throw new SkipException("Skiped");
    }
    @Test(priority = 1)
    public void test4() {
        SoftAssert softAssert = new SoftAssert();
        String word1 = "Mixa";
        String word2 = "Mixa";
//      System.out.println("Test4");
        softAssert.assertNotEquals(word1, word2, "Проверка что: "+word1+"НЕ равен "+ word2);
    }
    @AfterMethod
    public void teardown() {
        System.out.println("After method");
    }
    @AfterClass
    public  void AfterClass(){
        System.out.println("After class");
    }
    @AfterTest
    public  void afterTest(){
        System.out.println("After Test");
    }
    @AfterSuite
    public  void AfterSuite() {
        System.out.println("After Suite");
    }
}
