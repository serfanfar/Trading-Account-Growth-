package com.example.myapplication;
import android.provider.Telephony;

import java.*;
@SuppressWarnings("IntegerDivisionInFloatingPointContext")
public class Main {


    public static void main(String[] args) {

        System.out.println("This is a simple rate Calculator !");
        RateObject.Rate Rate = new RateObject.Rate(50000);
       show("Projected Results for the Upcoming Month:");
        show("Projected Observed Amount for the Next Month :");
        show(Double.toString((int)Rate.calcObsvRate()));
        show("Projected Grace Amount for the Next Month :");
        show(Double.toString((int)Rate.calcGraceRate()));
        show("Projected Mean Amount for the Next Month :");
        
        show(Double.toString((int)Rate.calcMeanRate()));
        show("Projected Base Amount for the Next Month :");
        show(Double.toString((int)Rate.calcBaseRate()));
        show("Projected Linear Amount for the Next Month :");
        show(Double.toString((int)Rate.calcLinearRate()));
        show("Projected Month Stop for the Next Month :");
        show(Double.toString((int)Rate.calcSMonthRate()));
        show("Projected Neutral Growth for the Next Month :");
        show(Double.toString((int)Rate.redInclusiveProjection()));
        show("Expected Range :");
        show(Double.toString((int)Rate.calcSMonthRate()) + " " + Double.toString((int)Rate.calcGraceRate()));

        double RealistcAverage = (Rate.calcMeanRate()+Rate.calcSMonthRate())/2;
        show("Potential Convergence: " + Double.toString((int)RealistcAverage));
        show("Daily Averages for Growth:");
        show(Double.toString(-1*((int)Rate.principle-(int)Rate.calcGraceRate())/22));
        show(Double.toString((int)-1*(int)(Rate.principle-(int)Rate.calcBaseRate())/22));
        show(Double.toString((int)-1*(int)(Rate.principle-(int)Rate.calcMeanRate())/22));
       show(Double.toString((int)-1*((int)Rate.principle-(int)RealistcAverage)/22));
       show(Double.toString((int)((int)Rate.principle*0.06)/22*-1));

       show("Potential All time High Continuation tone:");
       show(Double.toString((int)Rate.calcAllTimeHighRate()));


    }

    public static void show (String argument) {
        System.out.println(argument);
    }

}
