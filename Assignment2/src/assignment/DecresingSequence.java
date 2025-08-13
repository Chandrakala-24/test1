package assignment;
	import java.io.*;
	import java.util.*;

	class UserMainCode {

	    public class Result {
	        public final int output1;
	        public final int output2;

	        public Result(int out1, int out2) {
	            output1 = out1;
	            output2 = out2;
	        }
	    }

	    public Result decreasingSeq(int[] input1, int input2) {
	        if (input2 <= 1) {
	            return new Result(0, 0); 
	        }

	        int countSequences = 0;
	        int longestLength = 0;
	        int currentLength = 1;

	        for (int i = 1; i < input2; i++) {
	            if (input1[i] < input1[i - 1]) {
	                currentLength++;
	            } else {
	                if (currentLength > 1) {
	                    countSequences++;
	                    if (currentLength > longestLength) {
	                        longestLength = currentLength;
	                    }
	                }
	                currentLength = 1;
	            }
	        }

	       
	        if (currentLength > 1) {
	            countSequences++;
	            if (currentLength > longestLength) {
	                longestLength = currentLength;
	            }
	        }

	        return new Result(countSequences, longestLength);
	    }
	}


