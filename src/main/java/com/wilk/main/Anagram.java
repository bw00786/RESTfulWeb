package com.wilk.main;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() !=str2.length()) return false;

        char[] strChr = str1.toCharArray();
        char[] strChr2 = str2.toCharArray();
        Arrays.sort(strChr);
        Arrays.sort(strChr2);
        return (Arrays.equals(strChr,strChr2));
    }
    public static void main(String[] argv) {

        String str1 = "abc";
        String str2 = "ace";
        if (isAnagram(str1,str2)) System.out.println("Is Anagram");
        else System.out.println("Is not anagram");
    }
}
