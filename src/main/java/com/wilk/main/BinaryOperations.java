package com.wilk.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class BinaryOperations {

    public void numOfConsecutiveOnes(String n) {

       int d= Integer.toBinaryString(Integer.parseInt(n)).replaceAll("(0|(?<!1)1(?!1))", "").length();
       System.out.println("\n" + d);
    }

    public List<Integer> convertToBinary(int num) {


        List<Integer> list = new ArrayList<>();
        int index =0;
        int[] binary = new int[40];
        while (num > 0) {
            binary[index++] = num%2;
            num = num/2;
        }
        for (int i=index -1; i>=0; i--) {
            list.add(binary[i]);
        }
        return list;
    }
    public static void main(String[] argv) {
        int i = 18;
        int j =0;
        StringBuffer k = new StringBuffer();
        List<Integer> n = new ArrayList<>();
        BinaryOperations  bo = new BinaryOperations();
        n = bo.convertToBinary(i);
        for (Integer t: n) {
            System.out.print(t.toString());
            k.append(t.toString());
        }
        //System.out.println("string buffer "+k.toString());
          bo.numOfConsecutiveOnes(k.toString());
        }


}
