package com.stackroute.pe3;

public class ExceptionExample {

    String message;

    public ExceptionExample(String message){

        System.out.println(this.message = message);

    }

    public static void main(String[] args) throws Exception {

        ExceptionExample exceptionExample = new ExceptionExample("Throwing exception in try block");

        try{
            throw  new Exception(exceptionExample.message);
        }
        catch (Exception exp){
            System.out.println(exp.getMessage());
        }

        finally {
            System.out.println("I was there");
        }

    }
}
