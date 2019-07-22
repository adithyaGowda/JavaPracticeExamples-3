package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IgnoreVowelsTest {
    IgnoreVowels ignoreVowels;

    @Before
    public void setUp() throws Exception {
        ignoreVowels = new IgnoreVowels();
    }

    @After
    public void tearDown() throws Exception {
        ignoreVowels = null;
    }

    @Test
    public void inputCountryNamesIgnoresVowels(){
        String[] data = {"India","United States","Germany","Egypt","czechoslovakia"};
        String[] result = {"Ind","Untd Stts","Grmny","Egypt","czchslvk"};

        assertEquals(result,ignoreVowels.vowelsIgnore(data));
    }

    @Test
    public void inputCountryNamesNotIgnoresVowels(){
        String[] data = {"India","United States","Germany","Egypt","czechoslovakia"};
        String[] result = {"Ind","Untd",""};

        assertNotEquals(result,ignoreVowels.vowelsIgnore(data));
    }

    @Test
    public void inputNullDataGivesNullOutput(){
        assertNull(ignoreVowels.vowelsIgnore(null));
    }
}