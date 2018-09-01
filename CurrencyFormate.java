package HackerRank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormate 
{
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the amount ");
	        double payment = scanner.nextDouble();
	        scanner.close();
	        
	        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
	        NumberFormat cnFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
	        NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        NumberFormat inFormat = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
	        NumberFormat caFormat=  NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
	        NumberFormat jaFormat=  NumberFormat.getCurrencyInstance(Locale.JAPAN);
	        
	        String us = usFormat.format(payment);
	        String india = inFormat.format(payment);
	        String france = frFormat.format(payment);
	        String china = cnFormat.format(payment);
	        String canada_franch=caFormat.format(payment);
	        String japan=jaFormat.format(payment);

	        System.out.println("US: " + us);
	        System.out.println("India: " + india);
	        System.out.println("China: " + china);
	        System.out.println("France: " + france);
	        System.out.println("canada_franch: " + canada_franch);
	        System.out.println("Japan : "+japan);
	    }

}
