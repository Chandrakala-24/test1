package Class1;

public class DuplicateString {
	public static void main(String args[]) {
		 String[] arr= {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"}; 
		 for(int i=0;i<arr.length-1;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]==arr[j]) {
					 System.out.println(arr[j]);
				 }
					 
			 }
		 }
	}

}
