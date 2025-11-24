package Revision.DateAndCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateViaJava {

    public static void main(String[] args)
    {
        //Note - Get date,time,day,month symbol from google or chatgpt
        //Print current date
        Date dateObj = new Date();
        String currentDate = dateObj.toString();
        System.out.println("Date without Customization = "+currentDate);

        //Print customized date in format - month/date/year hr:min:sec
        SimpleDateFormat simpleDateFormatObj = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String customizedDate = simpleDateFormatObj.format(dateObj);
        System.out.println("Customized Date = "+customizedDate);

        //Print current day
        simpleDateFormatObj.applyPattern("EEEE");
        String current_Day = simpleDateFormatObj.format(dateObj);
        System.out.println("Current Day = "+current_Day);

    }

}
