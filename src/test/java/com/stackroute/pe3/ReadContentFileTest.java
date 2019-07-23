package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class ReadContentFileTest {
    ReadContentFile readContentFile;

    @Before
    public void setUp() throws Exception {
        readContentFile = new ReadContentFile();
    }

    @After
    public void tearDown() throws Exception {
        readContentFile = null;
    }

    @Test
    public void inputPathNameShouldReturnEqualStringValue(){
        try {
            File data = new File("/home/cgi/Downloads/random/hello.txt");
            assertEquals("Done", readContentFile.contentRead(data));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void inputPathNameIsCheckingForNotEqualStringValue(){
        try {
            File data = new File("/home/cgi/Downloads/random/hello.txt");
            assertNotEquals("adasdasdasd", readContentFile.contentRead(data));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}