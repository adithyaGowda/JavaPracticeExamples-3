package com.stackroute.pe3;

public class IgnoreVowels {

    public String [] vowelsIgnore(String[] input){

        if(input == null)
            return null;

        String[] output = new String[input.length];

        for (int i=0; i < input.length; i++){
            output[i] = input[i].replaceAll("[aeiou]","");
        }

        return output;
    }
}
