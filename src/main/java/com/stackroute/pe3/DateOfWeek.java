package com.stackroute.pe3;

import java.util.Calendar;

public class DateOfWeek {

    Calendar calendar = Calendar.getInstance();


    public String firstDayOfWeek(){

        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return ("Mon" + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.MONTH) + " " + calendar.get(Calendar.YEAR));
    }


    public String lastDayOfWeek(){

        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        calendar.add(Calendar.DAY_OF_WEEK,6);
        return ("Sun" + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.MONTH) + " " + calendar.get(Calendar.YEAR));
    }

}
