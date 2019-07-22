package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition matrixAddition;

    @Before
    public void setUp() throws Exception {
        matrixAddition = new MatrixAddition();
    }

    @After
    public void tearDown() throws Exception {
        matrixAddition = null;
    }

    @Test
    public void inputMatricesGivesSumOfMatrices(){
        int[][] data1 = {{1,2},{3,4}};
        int[][] data2 = {{2,3},{5,5}};
        int[][] result = {{3,5},{8,9}};

        assertEquals(result,matrixAddition.additionMatrix(2,2,data1,data2));
    }

    @Test
    public void inputMatricesGivesDifferentSum(){
        int[][] data1 = {{1,2},{3,4}};
        int[][] data2 = {{2,3},{5,5}};
        int[][] result = {{},{}};

        assertNotEquals(result,matrixAddition.additionMatrix(2,2,data1,data2));
    }

    @Test
    public void inputNullMatricesGivesNull(){

        assertNull(matrixAddition.additionMatrix(2,2,null,null));
    }
}