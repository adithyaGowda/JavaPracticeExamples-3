package com.stackroute.pe3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;


public class WordFrequency {

    public String frequencyWord(File input) throws Exception {


        BufferedReader br = new BufferedReader(new FileReader(input));
        String data;

        if((data = br.readLine()) != null){

            String[] words = data.split(" ");
            String[] output = new String[words.length];
            int count=1;

            for(int i=0; i<words.length; i++)
            {
                for(int j=i+1; j<words.length; j++)
                {
                    if(words[i].equals(words[j]))
                    {
                        count++;
                        words[j]="";
                    }
                }
                if(words[i]!=""){
                    output[i] = (words[i]+" : "+count);
                }
            }


            return Arrays.toString(output);
        }


        return "null is not allowed";
    }
}

