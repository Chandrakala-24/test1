package assignments;
import java.util.*;
public class JumbledWord {
	public static String jumbleWord(String word,int method) {
		StringBuilder odd=new StringBuilder();
		StringBuilder even=new StringBuilder();
		for(int i=0;i<word.length();i+=2) {
			odd.append(word.charAt(i));
			}
		if(method==1) {
			for(int i=(word.length()%2==0?word.length() -1:word.length() -2);i>=0;i-=2)
			{
				even.append(word.charAt(i));
			}
		}
		else if(method==2) {
			for(int i=1;i<word.length();i+=2) {
				even.append(word.charAt(i));
			}
		}
		return odd.toString()+even.toString();
		}
	public static String jumbleSentence(String sentence,int method) {
		String[]words=sentence.split(" ");
		StringBuilder result=new StringBuilder();
		for(String word:words) {
			result.append(jumbleWord(word,method)).append(" ");
		}
		return result.toString().trim();
	}
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String sentence=in.nextLine();
		int method=in.nextInt();
		String jumbledSentence=jumbleSentence(sentence,method);
		System.out.println(jumbledSentence);
		in.close();
	}
}

			
	