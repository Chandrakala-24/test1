package Milestone2;

public class SumOfNonPrimeIndexValues {
	class UserMainCode {
	    public int sumOfNonPrimeIndexValues(int[] input1, int input2) {
	        int sum = 0;
	        
	        for (int i = 0; i < input2; i++) {
	            if (!isPrime(i)) { // if index is non-prime
	                sum += input1[i];
	            }
	        }
	        return sum;
	    }

	    private boolean isPrime(int n) {
	        if (n < 2) return false;
	        if (n == 2) return true;
	        if (n % 2 == 0) return false;
	        for (int i = 3; i * i <= n; i += 2) {
	            if (n % i == 0) return false;
	        }
	        return true;
	    }
	}

}
