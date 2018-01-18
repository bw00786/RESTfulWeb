package com.wilk.main;

public class FindMissingNumber {

    public static int findNum(int[] arr) {

        int n = arr.length + 1;
        int sum = n*(n+1)/2;
        for (int i=0; i< arr.length;i++) {

            sum -= arr[i];
        }
        return sum;
    }
    public static void main(String[] argv) {

        int[] a = {1,2,3,4,5,6,7,8,9,10,12,13,14,15};
        int i = findNum(a);
        System.out.println(i);
    }
}
