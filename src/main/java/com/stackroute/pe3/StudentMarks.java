package com.stackroute.pe3;

public class StudentMarks {


    public String studentsGradeCheck(int stuGrades[]){


        int numOFStudents = stuGrades.length;
        int count = 0;

        if( numOFStudents == 0)
            return null;


        for (int i=0; i< numOFStudents; i++) {

            if( stuGrades[i] < 0 ||  stuGrades[i] > 100)
                count++;
        }

        if(count != 0)
            return "Error: Out of range";
        else
            return "within range";
    }
}
