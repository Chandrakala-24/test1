package assignment;
	import java.io.*;
	import java.util.*;

	class MainCode {
	    public int sumofSumsOfDigits(int input1) {
	        String numStr = String.valueOf(Math.abs(input1));
	        int n = numStr.length();
	        int totalSum = 0;

	       
	        for (int i = 0; i < n; i++) {
	            int sum = 0;
	          
	            for (int j = i; j < n; j++) {
	                sum += numStr.charAt(j) - '0';
	            }
	            totalSum += sum;
	        }
	        return totalSum;
	    }
	}


