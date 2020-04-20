package com.company;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Figure {
    private int day;
    private int cases;
    private int deaths;
    private int fips;

    public Figure(int day, int cases, int deaths, int fips){
        this.day = day;
        this.cases = cases;
        this.deaths = deaths;
        this.fips = fips;
    }
    public void printInts(){
        System.out.println(Integer.toString(day) + " " + Integer.toString(cases) + " " + Integer.toString(deaths)
                + " " + Integer.toString(fips));
    }


}


