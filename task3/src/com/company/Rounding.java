package com.company;

public class Rounding {

    public static void main(String[] args) {
	    String[] towns = new String[4];
        towns[0] = "Nice";
        towns[1] = "Abu Dhabi";
        towns[2] = "Naples";
        towns[3] = "Vatican City";

        double [] population = new double[4];
        population [0] = 942208;
        population [1] = 1482816;
        population [2] = 2186853;
        population [3] = 572;
        for (int i = 0; i < 4; i++)
            System.out.println(towns[i] + " — " + (int)population[i]);

        population = round(population);
        System.out.println();

        for (int i = 0; i < 4; i++)
            System.out.println(towns[i] + " — " + (int)(population[i]));
    }
    public static double[] round (double[] population){
        for (int i = 0; i < 4; i++)
            population[i] = (Math.round(population[i]/1000000)*1000000);
        return (population);
    }
}
