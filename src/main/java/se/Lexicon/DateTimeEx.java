package se.Lexicon;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateTimeEx {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
    }
    public static void ex1(){

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate nextBirthDate = LocalDate.parse("2012-01-22");
        System.out.println("nextBirthDate = " + nextBirthDate);

        LocalDate NextDay = LocalDate.of(2021,02,2);
        System.out.println("NextDay = " + NextDay);
    }
    public static void ex2(){
        
        LocalDate CurrentDate = LocalDate.now();
        System.out.println("CurrentDate = " + CurrentDate);

        Month feb = CurrentDate.getMonth();
        System.out.println("feb = " + feb);

        DayOfWeek dayOfWeek = CurrentDate.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);
    }

    public static void ex3(){

        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime = " + currentTime);

        System.out.println(currentTime.truncatedTo(ChronoUnit.MINUTES));
        System.out.println(currentTime.truncatedTo(ChronoUnit.SECONDS));

        LocalTime lunchTime = LocalTime.parse("01:00");
        System.out.println("lunchTime = " + lunchTime);
    }
    public static void ex4(){

        LocalTime localTime = LocalTime.parse("14:23").plusHours(2);
        System.out.println("localTime = " + localTime);
    
    }


    public static void ex5(){

        LocalTime currentDateTime = LocalTime.now();
        System.out.println("currentDateTime = " + currentDateTime);
        
        LocalTime plusHours = currentDateTime.plusHours(2);
        System.out.println("plusHours = " + plusHours);
    }
}
