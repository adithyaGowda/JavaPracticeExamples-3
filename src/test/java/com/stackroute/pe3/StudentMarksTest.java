package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks studentMarks;

    @Before
    public void setUp() throws Exception {
        studentMarks = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        studentMarks = null;
    }

    @Test
    public void inputdataChecksForRange(){
        int[] data={30,40,50};
        assertEquals("within range",studentMarks.studentsGradeCheck(data));
    }

    @Test
    public void inputdataChecksForRangeAndReturnsNotEqual(){
        int[] data={30,40,50};
        assertNotEquals("90",studentMarks.studentsGradeCheck(data));
    }

    @Test
    public void inputdataIsBeyondRangeSoExpectsException(){
        int[] data={120,10,150,120};

        assertEquals("Error: Out of range",studentMarks.studentsGradeCheck(data));

    }

    @Test
    public void inputNodataReturnsNull(){
        int[] data={ };
        assertNull(studentMarks.studentsGradeCheck(data));
    }



}
