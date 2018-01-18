package com.wilk.main;

public class findNthFibbonacci {

    public static long fibonacci(int n) {

        if (n <= 1)  return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] argv) {

        int n = 50;
        for (int i = 0; i <= n; i++) {
            if (i==n)
              System.out.println(fibonacci(i));
        }
    }
}
