package Assignments;

import java.time.LocalDate;

public class Assignment4
{
    public static void main(String[] args)
    {
        String input = """
                16-07-1998 27-06-2017
                04-02-2016 04-04-2017
                04-05-2017 04-04-2017
                04-04-2015 04-04-2016
                04-04-2015 15-03-2016
                """;
        String[] queries = input.split("\n");
        for (String q : queries)
        {
            get(q);
        }
    }

    public static void get(String s)
    {
        String signupString = s.substring(0, s.indexOf(' '));
        String currentString = s.substring(s.indexOf(' ')+1, s.length());
        LocalDate signup = getDate(signupString);
        LocalDate currentDate = getDate(currentString);
        LocalDate increment = signup;
        LocalDate start = get30Before(signup);
        LocalDate end = get30Later(signup);
        if (signup.isAfter(currentDate))
        {
            System.out.println("No range");
            return;
        }
        LocalDate bestStart = start;
        LocalDate bestEnd = end;
        while(start.isBefore(currentDate))
        {
            bestStart = start;
            bestEnd = end;
            increment = increment.plusYears(1);
            start = increment.minusDays(30);
            end = increment.plusDays(30);
        }
        if (bestEnd.isAfter(currentDate))
        {
            bestEnd = currentDate;
        }
        System.out.println(getString(bestStart)+" "+getString(bestEnd));
    }
    public static LocalDate getDate(String s)
    {
        int day = Integer.parseInt(s.substring(0,s.indexOf('-')));
        int month = Integer.parseInt(s.substring(s.indexOf('-')+1, s.lastIndexOf('-')));
        int year = Integer.parseInt(s.substring(s.lastIndexOf('-')+1, s.length()));
        LocalDate date = LocalDate.of(year, month, day);
        return date;
    }
    public static String getString(LocalDate date)
    {
        String day = Integer.toString(date.getDayOfMonth());
        if (day.length()<2)
        {
            day = "0"+day;
        }
        String month = Integer.toString(date.getMonthValue());
        if (month.length()<2)
        {
            month = "0"+month;
        }
        String year = Integer.toString(date.getYear());
        String s = day+"-"+month+"-"+year;
        return s;
    }
    public static LocalDate get30Later(LocalDate date)
    {
        return date.plusDays(30);
    }
    public static LocalDate get30Before(LocalDate date)
    {
        return date.minusDays(30);
    }
}
