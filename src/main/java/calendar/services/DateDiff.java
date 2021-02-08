package calendar.services;

import java.time.LocalDate;
import java.time.Period;

import static java.time.temporal.ChronoUnit.DAYS;

public class DateDiff {



    public String calcDiff(int Year, int Month, int DayOfMonth){

        LocalDate today = LocalDate.now();
        LocalDate dateInput = LocalDate.of(Year, Month, DayOfMonth);

        Period p = Period.between(today,dateInput);
        int days = p.getDays();
        int month = p.getMonths();
        int year = p.getYears();



        return year + " years " + month + " months " + days + " days ";
    }
}
