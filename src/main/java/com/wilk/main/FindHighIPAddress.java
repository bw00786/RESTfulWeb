package com.wilk.main;

import java.util.HashMap;
import java.util.Map;

public class FindHighIPAddress {

    public static String findMax(String[] lines) {

        String maxIp = "";
        int maxIpCount =0;
        Map<String,Integer> map = new HashMap<>();
        for (int i=0; i<lines.length; i++) {
            String[] l2 = lines[i].split(" ");
            String ipAddr = l2[0];
            if(!map.containsKey(ipAddr)) {
                map.put(ipAddr,1);
            }else {
                map.put(ipAddr,map.get(ipAddr) + 1);
            }

        }
        for (Map.Entry<String,Integer> n: map.entrySet()) {
            if ((Integer)n.getValue() > maxIpCount) {
                maxIpCount = (Integer)n.getValue();
                maxIp = (String)n.getKey();
            }
        }
        return maxIp;

    }

    public static void main(String[] argv) {

        String[] l = {"127.1.2.3 top down list", "123.3.4.5 top up list", "127.1.2.3 top up north",
                "127.1.2.3 top up forward", "120.0.0.0 top down list"};

        System.out.println("The highest value is " + findMax(l));
    }
}
