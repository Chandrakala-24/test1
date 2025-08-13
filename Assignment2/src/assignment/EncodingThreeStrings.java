package assignment;

import java.io.*;
import java.util.*;

class Main {

    public static class Result {
        public final String output1;
        public final String output2;
        public final String output3;

        public Result(String out1, String out2, String out3) {
            this.output1 = out1;
            this.output2 = out2;
            this.output3 = out3;
        }
    }

    public Result encodeThreeStrings(String input1, String input2, String input3) {

        if (input1 == null) input1 = "";
        if (input2 == null) input2 = "";
        if (input3 == null) input3 = "";

        String[] p1 = splitString(input1);
        String[] p2 = splitString(input2);
        String[] p3 = splitString(input3);

        String out1 = p1[0] + p2[0] + p3[0];
        String out2 = p1[1] + p2[1] + p3[1];
        String out3 = toggleCase(p1[2] + p2[2] + p3[2]);

        return new Result(out1, out2, out3);
    }

    private String[] splitString(String s) {
        int len = s.length();
        int base = len / 3;
        int rem = len % 3;

        int frontLen = base;
        int midLen = base;
        int endLen = base;

        if (rem == 1) {
            midLen += 1;
        } else if (rem == 2) {
            frontLen += 1;
            endLen += 1;
        }

        String front = s.substring(0, frontLen);
        String middle = s.substring(frontLen, frontLen + midLen);
        String end = s.substring(frontLen + midLen);

        return new String[] { front, middle, end };
    }

    private String toggleCase(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Main u = new Main(); // 
        Result r = u.encodeThreeStrings("John", "Johny", "Janardhan");
        System.out.println(r.output1);
        System.out.println(r.output2);
        System.out.println(r.output3);
    }
}
