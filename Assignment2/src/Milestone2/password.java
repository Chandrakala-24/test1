package Milestone2;
import java.util.*;
public class password {
	
		public static boolean isstable(int num) {
			String s=String.valueOf(num);
			int[] freq=new int[10];
			for(char c:s.toCharArray()) {
				freq[c-'0']++;
			}
			Set<Integer> unique=new HashSet<>();
			for(int f:freq) {
				if(f>0) {
					  unique.add(f);
				}
			}
			  return unique.size() == 1; 
			
		}
		 public static boolean isUnstable(int num) {
		        return !isstable(num); 
		    }
		public static void main(String[]args) {
			   int input1 = 12;
		        int input2 = 1313;
		        int input3 = 122;
		        int input4 = 678;
		        int input5 = 898;

		        int stableCount = 0;
		        int unstableCount = 0;

		        int[] numbers = {input1, input2, input3, input4, input5};

		        for (int num : numbers) {
		            if (isstable(num)) {
		                stableCount++;
		            } else {
		                unstableCount++;
		            }
		        }
		        int password = (unstableCount * 10) + stableCount;

		     
		        System.out.println("Stable numbers: " + stableCount);
		        System.out.println("Unstable numbers: " + unstableCount);
		        System.out.println("Password: " + password);
		    }
		
			
		}

		


