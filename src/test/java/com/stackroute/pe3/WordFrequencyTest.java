package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class WordFrequencyTest {
    WordFrequency wordFrequency;


    @Before
    public void setUp() throws Exception {
        wordFrequency = new WordFrequency();
    }

    @After
    public void tearDown() throws Exception {
        wordFrequency = null;
    }

    @Test
    public void inputPathNameIsReadAndFrequencyOfWordsIsReturned(){
        try {
            File file = new File("/home/cgi/Downloads/random/hello.txt");

            assertEquals("[hello : 1, world : 1, welcome : 1, to : 1, programming : 1, experience : 1, the : 1, commitment : 1]", wordFrequency.frequencyWord(new File("/home/cgi/Downloads/random/hello.txt")));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void inputPathNameChecksForNotEquality(){
        try {
            File file = new File("/home/cgi/Downloads/random/hello.txt");

            assertNotEquals("[hello : 1, the : 1, commitment : 1]", wordFrequency.frequencyWord(new File("/home/cgi/Downloads/random/hello.txt")));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void inputPathNameShouldReturnSomeValues(){
        try {
            File file = new File("/home/cgi/Downloads/random/hello.txt");

            assertNotNull(wordFrequency.frequencyWord(new File("/home/cgi/Downloads/random/hello.txt")));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}