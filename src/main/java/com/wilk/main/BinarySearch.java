package com.wilk.main;

public class BinarySearch {

    public static int binSearch(int[] arr,int target, int low, int high) {

        if (high < low) return -1;
        int mid = (low + high)/2;
        if (target == arr[mid]) return mid;
        else if (target < arr[mid]) return binSearch(arr,target,low,mid + 1);
        else if (target > arr[mid]) return binSearch(arr,target,mid-1,high);
        return -1;
    }
    public static void main(String[] argv) {
        int[] i = {2,3,4,5,6,7,9,10,11};
        int j = binSearch(i,10,0,i.length);
        System.out.println(j);
    }
}
