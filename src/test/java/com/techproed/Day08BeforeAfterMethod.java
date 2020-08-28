package com.techproed;

import org.junit.*;

public class Day08BeforeAfterMethod {

    @BeforeClass
    public static void setUp(){
        System.out.println("Setup");


    }

    @AfterClass
    public static void  tearDown(){
        System.out.println("tearDown");

    }

    @Before
    public void methoddanOnce(){
        System.out.println("SetUp2 calisti");
    }


    @Test
    public  void test1(){
        System.out.println("Test1 calisti");
    }

    @Test
    public void test2(){
        System.out.println("Test2 calisti..");
    }


    @After
    public void methoddanSonra(){
        System.out.println("TearDown calisti...");
    }
}
