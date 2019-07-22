package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveCheckTest {
    ConsecutiveCheck consecutiveCheck;

    @Before
    public void setUp() throws Exception {
        consecutiveCheck = new ConsecutiveCheck();
    }

    @After
    public void tearDown() throws Exception {
        consecutiveCheck = null;
    }

    @Test
    public void inputDescendingStringChecksForConsecutive(){
        assertEquals("consecutive number", consecutiveCheck.checkingConsecutive("54,53,52,51,50,49,48"));
    }

    @Test
    public void inputAscendingStringChecksForConsecutive(){
        assertEquals("consecutive number", consecutiveCheck.checkingConsecutive("1,2,3,4"));
    }

    @Test
    public void inputStringChecksForConsecutive(){
        assertEquals("not a consecutive number", consecutiveCheck.checkingConsecutive("98,96,95,94,93"));
    }

    @Test
    public void inputTestStringVerifiesForConsecutive(){
        assertEquals("not a consecutive number", consecutiveCheck.checkingConsecutive("1,2,3,4,5,6,6"));
    }

    @Test
    public void nullInputGivesNullOutput(){
        assertNull(consecutiveCheck.checkingConsecutive(null));
    }
}