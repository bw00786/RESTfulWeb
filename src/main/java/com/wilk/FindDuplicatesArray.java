package com.wilk;

public class FindDuplicatesArray {

    public static void findDups(int[] arr) {
        for (int i =0; i<arr.length; i++) {
            try {
                if (arr[Math.abs(arr[i])] >= 0) {
                    arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
                } else {
                    System.out.print(Math.abs(arr[i]) + " ");
                }
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
    public static void main(String[] argv) {

        int[] a = {1,2,3,4,5,8,2,10,3,12,1,22};
        findDups(a);
    }
}
