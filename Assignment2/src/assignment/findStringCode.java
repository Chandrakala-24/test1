package assignment;
import java.util.Scanner;
class findStringCode {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String input1=in.nextLine();
		findStringCode obj = new findStringCode();
        int result = obj.StringCode(input1);
        System.out.println("String Code: " + result);

        in.close();
	}
	public int StringCode(String input1) {
		String []words=input1.split(" ");
		StringBuilder code=new StringBuilder();
		for(String word:words) {
			int sum=0;
			int len=word.length();
			 for(int i=0;i<=(len-1)/2;i++) {
				 int j=len-1-i;
				 int pos1=Character.toUpperCase(word.charAt(i))-'A'+1;
				 int pos2=Character.toUpperCase(word.charAt(j))-'A'+1;
				 if(i==j) {
					 sum+=pos1;
				 }
				 else {
					 sum+=Math.abs(pos1-pos2);
				 }
			 }
			 code.append(sum);
		}
		return Integer.parseInt(code.toString());
	}
}

