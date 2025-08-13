package assignment;


	import java.io.*;
	import java.util.*;

	class UserMainCode1 {
	    public int sumOfPowerOfDigits(int input1) {
	        String numStr = String.valueOf(Math.abs(input1));
	        int n = numStr.length();
	        int sum = 0;

	        for (int i = 0; i < n; i++) {
	            int base = numStr.charAt(i) - '0';
	            int exp = (i == n - 1) ? 0 : (numStr.charAt(i + 1) - '0');
	            sum += powInt(base, exp);
	        }
	        return sum;
	    }

	    
	    private int powInt(int base, int exp) {
	        if (exp == 0) return 1; // x^0 = 1 for any x
	        int result = 1;
	        for (int i = 0; i < exp; i++) {
	            result *= base;
	        }
	        return result;
	    }
	}

