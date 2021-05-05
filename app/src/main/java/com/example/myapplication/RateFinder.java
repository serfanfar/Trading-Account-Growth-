package com.example.myapplication;
import java.*;
import java.util.Scanner;

public class RateFinder {

    public static void main(String []args){
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Find your growth rate");
        double startBalacne = 3205;
        double finalBalance = 4500;
        // need to solve an exponential equation
        // X^5*p = newBalance
        //x^5= divided
        //5lnx = divided/5;
        double Mbalance1 =50000;
        double Mbalance2 = 14000000;
        double divided = Mbalance2/Mbalance1;
        double dividedByFive = Math.log(divided)/220;
        double Mrate = Math.pow(10,dividedByFive);
        double [] rateSet = {Mrate,1.0209092,1.0142524,1.0087117,1.01};
        System.out.println("Enter your rate choosing from options:");
        for(int i=0;i<rateSet.length;i++) {
            System.out.println("Rate number "+(int)(i+1) +" "+rateSet[i]);
        }
        System.out.println("Enter the rate number only");
        int selectedRateIndex = inputDevice.nextInt();
        double rate = rateSet[selectedRateIndex-1];
        System.out.println("You selected rate #"+selectedRateIndex+" " + rate);
        String answer;
       do  {
            System.out.println("How many days to keep going with this rate?");
            int days = inputDevice.nextInt();
            double amount = Math.pow(rate, days) * finalBalance;
            System.out.println("After " + days + " days, your account balance will be:" + (int) amount);
            System.out.println("Your money will grow by: " + (int)(amount/finalBalance));
            System.out.println("Daily balance goals :");
            for(int i=0;i<days;i++) {

              System.out.println("Day "+ (int)(i+1) +" :" + Math.round(Math.pow(rate,i+1)*finalBalance) +


                      " gain of: "+Math.round(Math.pow(rate,i+1)*finalBalance-Math.pow(rate,i)*finalBalance));


            }

            System.out.println("Continue? YES/NO");
            answer=inputDevice.next();
        }while(answer.equals("YES") || answer.equals("yes"));
    }
}
