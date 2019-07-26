package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateOfWeekTest {
    DateOfWeek dateOfWeek;

    @Before
    public void setUp() throws Exception {
        dateOfWeek = new DateOfWeek();
    }

    @After
    public void tearDown() throws Exception {
        dateOfWeek = null;
    }

    @Test
    public void callingFunctionsOfDateOfWeekReturnsDate(){

        assertEquals("Mon 22 6 2019",dateOfWeek.firstDayOfWeek());
        assertEquals("Sun 28 6 2019",dateOfWeek.lastDayOfWeek());
    }

    @Test
    public void callingFunctionsOfDateOfWeekReturnsNotEqualDates(){

        assertNotEquals("Sun 22 6 2019",dateOfWeek.firstDayOfWeek());
        assertNotEquals("Mon 28 6 2019",dateOfWeek.lastDayOfWeek());
    }

    @Test
    public void callingFunctionsShouldReturnSomeValues(){
        assertNotNull(dateOfWeek.firstDayOfWeek());
        assertNotNull(dateOfWeek.lastDayOfWeek());
    }
}