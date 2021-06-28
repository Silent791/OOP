package com.company;

public class Primes {

    public static void main(String[] args) {
        for (int n=2; n<100; n++)
            if (isPrime(n)==true)
            {System.out.print(n+"; ");}
    }
    public static boolean isPrime(int n)  {
        boolean m = false;
        for (int i=2; i<n; i++) {
            if (n%i ==0) {
                m = true;
            }
        }
        if (m == true)
        {return false;}
        else {return true;}
    }
}
