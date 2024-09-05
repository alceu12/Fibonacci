package org.example;

public class Fibonacci {
    public static boolean isFibonacci(int numero){
        int a = 0;
        int b = 1;
        int c = 0;
        while (c < numero){
            c = a + b;
            a = b;
            b = c;
        }
        if (c == numero){
            return true;
        } else {
            return false;
        }

    }
}
