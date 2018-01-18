package com.wilk.main;

public class Permutations {

    public static String swap(String str1, int i, int j) {

        char[] chr1 = str1.toCharArray();
        char temp;
        temp = chr1[i];
        chr1[i] = chr1[j];
        chr1[j] = temp;
        return String.valueOf(chr1);

    }
    public static void permute(String str1, int l, int r) {

        if (l == r) System.out.println(str1);
        else {
            for (int i=l; i<=r; i++) {
                str1 = swap(str1,l,i);
                permute(str1,l+1,r);
                str1 = swap(str1,l,i);
            }
        }
    }
    public static void main(String[] argv) {

        String a = "abc";
        int n = a.length();
        permute(a,0,n -1);
    }
}
