package me.aoa4eva;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Get the current time
        LocalDateTime rightNow= LocalDateTime.now();
        //Date from the user
        LocalDate userDate=null;

        //Set up formatters so that you can use them later
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter shortMonthFormat = DateTimeFormatter.ofPattern("dd MMM yyyy");
        DateTimeFormatter longFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        //Time formatter (time only)
        DateTimeFormatter hr24 = DateTimeFormatter.ofPattern("kk:m");

        //Output today's date in formats that have been preset
        System.out.println("The current date is: "+rightNow.format(longFormat));
        System.out.println("This is the current date and time unformatted: "+rightNow);

        //Output the current time in formats that have been preset
        System.out.println("This is the current system time: "+ LocalTime.now());
        System.out.println("This is the current system time (24 h format): "+LocalTime.now().format(hr24));

        //This is how you parse a string with a date time formatter
        String aDate = "22/05/2010";
        userDate = LocalDate.parse(aDate,dTF);
        System.out.println(userDate.format(longFormat));

     

        //Display the date entered
       System.out.println(userDate.format(shortMonthFormat));

       System.out.println("Now enter a year");
       String thisYear = keyboard.nextLine();
       Year newYear = Year.of(Integer.parseInt(thisYear));

       System.out.println("This is the year entered:"+newYear);


    }
}
