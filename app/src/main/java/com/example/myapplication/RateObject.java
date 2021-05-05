package com.example.myapplication;

public class RateObject {

    public static class Rate {
        final double observedRate =1.0118827;

        final double graceRate =1.0142524;
        final double meanRate =1.0087117;
        final double linearRate =1;
        final double baseRate=1.01;
        final double stopDay = 0.02;
        final double stopMonth=0.06;
        final double allTimeHigh=1.0209092;
        public double principle;

        public Rate() {
            principle=0;
        }
        public Rate(double entryPrinciple) {
            principle = entryPrinciple;
        }

        public double calcObsvRate () {

            return principle*Math.pow(observedRate,22);


        }
        public double calcGraceRate (){

            return principle*Math.pow(graceRate,22);

        }
        public double calcMeanRate (){

            return principle*Math.pow(meanRate,22);


        }  public double calcLinearRate (){

            return principle*1.22;


        }  public double calcSMonthRate (){


            return principle*(1-stopMonth);

        }
        public double calcBaseRate()
            {
            return principle * Math.pow(baseRate, 22);
        }
        public double calcAllTimeHighRate() {
            return principle*Math.pow(allTimeHigh,22);
        }

        // negative case : assuming there is a stop day in every week !
        public double redInclusiveProjection () {
           return principle*1.015;
        }
    }

}
