package cata1;

import java.util.Date;

public class Person {
    private final String name;
    private final Date birthday;
    private static final int MS_Per_Second = 1000;
    private static final int Second_Per_Minute = 60;
    private static final int Minute_Per_Hour = 60;
    private static final int Hour_Per_Day = 24;
    private static final double Day_Per_year = 365.25;
    private static final double Ms_Per_Year = MS_Per_Second * Second_Per_Minute * Minute_Per_Hour * Hour_Per_Day * Day_Per_year;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public int getBirthday(){
        return birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        long ms = new Date().getTime() - birthday.getTime();
        return toYears(ms);
    }

    private int toYears(long ms) {
        return (int)(ms/ Ms_Per_Year);
    }
}
