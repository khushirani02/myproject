package com.example.springbootproject.service;

import com.example.springbootproject.exceptions.MyException;

public class ExceptionHandlingEx {

    public int getIntegerFromString(String num){
        int res=-1;
        try {
            res = Integer.parseInt(num);
            throw new MyException("my exception thrown");
        }catch (MyException e){
            System.out.println("given string can't be converted into integer");
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("invalid");
            System.out.println(e.getMessage());
        }
//        finally {
//            System.out.println("came in finally");
//        }
        return res;
    }
}
