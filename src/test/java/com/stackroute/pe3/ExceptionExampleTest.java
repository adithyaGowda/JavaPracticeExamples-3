package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionExampleTest {
    ExceptionExample exceptionExample;

    @Before
    public void setUp() throws Exception {

        exceptionExample = new ExceptionExample("Initiating ExceptionExample class Object");
    }

    @After
    public void tearDown() throws Exception {
        exceptionExample = null;
    }

    @Test
    public void givenInputStringShouldPrintInExceptionObject(){
        assertEquals(true,exceptionExample.exceptionEx("Throwing exception"));
    }

    @Test
    public void givenInputStringShouldValidateForNotEquality(){
        assertNotEquals(false,exceptionExample.exceptionEx("Throwing exception"));
    }

    @Test
    public void givenNullInputGivesNullOutput(){
        assertNull(exceptionExample.exceptionEx(null));
    }

    @Test
    public void givenInputStringGivesNotNullOutput(){
        assertNotNull(exceptionExample.exceptionEx("Throwing exception"));
    }
}