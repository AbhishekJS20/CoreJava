package HackerRank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateAndTime 
{
	 public static String getDay(String day, String month, String year)
	 {
		 int intyear = Integer.parseInt(year);
         int intDay = Integer.parseInt(day);
         int intmonth = Integer.parseInt(month);
 
         String dateString = String.format("%d-%d-%d", intyear, intmonth, intDay);
         Date date = null;
         try {
              date = new SimpleDateFormat("yyyy-M-d").parse(dateString);
         }
         catch(ParseException ref){
             ref.printStackTrace();
         }  
     
         // Then get the day of week from the Date based on specific locale.
         String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
         
         return dayOfWeek.toUpperCase();
	        
	 }
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("**If it string is not taking then input as a num**");
	        System.out.println("Enter Month ");
	        String month = in.next();
	        System.out.println("Enter Day ");
	        String day = in.next();
	        System.out.println("Enter Year ");
	        String year = in.next();
	        in.close();
	        System.out.println(getDay(day, month, year));
	    }
	}


