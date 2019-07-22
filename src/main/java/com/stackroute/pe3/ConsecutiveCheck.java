package com.stackroute.pe3;

public class ConsecutiveCheck {

    public String checkingConsecutive (String data){

        if (data == null)
            return null;

        String[] input = data.split(",");
        int[] value = new int[input.length];
        boolean flag = true;

        for (int i=0; i<input.length; i++) {

            value[i] = Integer.parseInt(input[i]);
        }

        for (int i=0; i< value.length-1; i++){

            if(value[i+1] - value[i] == 1 || value[i] - value[i+1] == 1){

            }
            else
                flag = false;

        }

        if(flag)
            return "consecutive number";
        else
            return "not a consecutive number";
    }
}
