package com.stackroute.pe3;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadContentFile {

    public String contentRead(File file) throws  Exception{

//        File file = new File("/home/cgi/Downloads/random/hello.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String data;


        while((data = br.readLine()) != null){

            String x = data.toUpperCase();
            System.out.println(x);

        }

        return "Done";

    }

}
