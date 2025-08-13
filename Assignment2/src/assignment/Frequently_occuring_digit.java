package assignment;
	import java.io.*;
	import java.util.*;

	class UserMain {

	    public int mostFrequentlyOccurringDigit(int[] input1, int input2) {
	        int[] freq = new int[10]; 

	        
	        for (int i = 0; i < input2; i++) {
	            int num = Math.abs(input1[i]); 
	            if (num == 0) {
	                freq[0]++;
	            }
	            while (num > 0) {
	                int digit = num % 10;
	                freq[digit]++;
	                num /= 10;
	            }
	        }

	       
	        int maxFreq = -1;
	        int resultDigit = -1;

	        for (int digit = 0; digit <= 9; digit++) {
	            if (freq[digit] > maxFreq) {
	                maxFreq = freq[digit];
	                resultDigit = digit;
	            } else if (freq[digit] == maxFreq && digit > resultDigit) {
	                resultDigit = digit; 
	            }
	        }

	        return resultDigit;
	    }
	}


