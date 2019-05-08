package com.qq.qa.kata01;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class Kata01Test{

    @BeforeClass
    public void init() throws Exception {

    }

    @DataProvider
    public static Object[][] getParameters(Method method) {
        return new Object[][]{
                {3, Kata01.FIZZ},
                {5, Kata01.Buzz},
                {13, Kata01.FIZZ},
                {15, Kata01.FIZZ + Kata01.Buzz},
                {30, Kata01.FIZZ + Kata01.Buzz},
                {35, Kata01.FIZZ + Kata01.Buzz},
                {57, Kata01.FIZZ + Kata01.Buzz},
                };
    }

    @Test(dataProvider = "getParameters")
    public void fizzTest(Integer id,String fizzflag){
//        System.out.println("say hi test");
        System.out.println(id);
//        Assert.assertTrue(true);

        Kata01 kata01 = new Kata01();
        Assert.assertEquals(kata01.getFizzBuzz(id),fizzflag);
    }
}
