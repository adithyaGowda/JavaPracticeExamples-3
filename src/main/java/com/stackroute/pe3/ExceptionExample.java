package com.stackroute.pe3;

public class ExceptionExample {

    String message;

    public ExceptionExample(String message) {

        System.out.println(this.message = message);
    }

    public Boolean exceptionEx(String input)  {

        if (input == null)
            return null;

        else {

            try {

                throw new Exception(input);
            }
            catch (Exception exp) {

                System.out.println(exp.getMessage());

            }
            finally {

                System.out.println("I was there");
                return true;
            }


        }

    }

}
