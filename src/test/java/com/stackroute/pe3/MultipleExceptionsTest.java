package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleExceptionsTest {
    MultipleExceptions multipleExceptions;

    @Before
    public void setUp() throws Exception {
        multipleExceptions = new MultipleExceptions();
    }

    @After
    public void tearDown() throws Exception {
        multipleExceptions = null;
    }

    @Test
    public void inputDataWillThrowExceptions(){
        assertEquals("Done",multipleExceptions.exceptionGenerate(0,3,-1));
    }

    @Test
    public void inputDataValidatesForNotEquality(){
        assertEquals("Done",multipleExceptions.exceptionGenerate(0,3,-1));
    }


}