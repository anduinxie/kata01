package com.qq.qa.kata01;

import org.testng.collections.Lists;
import sun.rmi.server.InactiveGroupException;

import java.util.List;

public class Kata01 {

    public static final String FIZZ="Fizz";
    public static final String Buzz="Buzz";
    public static final Integer num1=3;
    public static final Integer num2=5;

    public List<String> fizzBuzz(int n){
        List<String> resultlist = Lists.newArrayList();
        for(Integer i = 1; i <= n; i++){
            System.out.println(getFizzBuzz(i));
            resultlist.add(getFizzBuzz(i));
        }
        return resultlist;
    }

    public String getFizzBuzz(Integer i){
        String result = "";
        result=isFizz(i)?result+=FIZZ:result;
        result=isBuzz(i)?result+=Buzz:result;
        if(result==""){
            return i.toString();
        }
        return result;
    }

    private Boolean isFizz(Integer i){
        if (i%num1==0||i.toString().contains(num1.toString())){
            return true;
        }
        return false;
    }

    private Boolean isBuzz(Integer i){
        if (i%num2==0||i.toString().contains(num2.toString())){
            return true;
        }
        return false;
    }
}
