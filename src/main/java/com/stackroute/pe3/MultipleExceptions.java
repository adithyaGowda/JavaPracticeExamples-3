package com.stackroute.pe3;

public class MultipleExceptions {

    public String exceptionGenerate(int result, int arraySize, int negativeSize) {

        int[] array = null;
        for(int i = 0; i<3 ; ++i)
            try {
                switch(i) {
                    case 0:
                        result = array[0];
                        break;
                    case 1:
                        array = new int[negativeSize];
                        break;
                    case 2:
                        array = new int[arraySize];
                        result = array[arraySize];
                        break;
                }
            } catch(NullPointerException e) {
                System.out.println("\nNullPointerException Exception caught. " +
                        "Message in NullPointerException is:\n" +
                        "\n" + e + "\n");
                System.out.println("The contents of the stack trace are:\n");
                e.printStackTrace();
            } catch(NegativeArraySizeException e) {
                System.out.println("\nNegativeArraySizeException Exception caught. " +
                        "Message in NegativeArraySizeException is:\n" +
                        "\n" + e + "\n");
                System.out.println("The contents of the stack trace are:\n");
                e.printStackTrace();
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("\nArrayIndexOutOfBoundsException Exception caught. " +
                        "Message in ArrayIndexOutOfBoundsException is:\n" +
                        "\n" + e + "\n");
            }
        return "Done";
    }
}
