package Revision.DateAndCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarViaJava {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();// Calendar is an abstract class so cannot create object with new

        Date time = cal.getTime();
        System.out.println("Current time = " +time);
        int dayOfMonth =  cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Current day of Month = "+dayOfMonth);
        int month = cal.get(Calendar.MONTH)+1;// 1 adding as by default month start as O = Jan
        System.out.println("Month = "+month);
        int year =  cal.get(Calendar.YEAR);
        System.out.println("Year = "+year);
        int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
        System.out.println("Hour Of Day = "+hourOfDay);
        int minute = cal.get(Calendar.MINUTE);
        System.out.println("Minute Of Day = "+minute);
        int second = cal.get(Calendar.SECOND);
        System.out.println("Second Of Day = "+second);

    }

}
