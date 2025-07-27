package Programs;

import java.util.Scanner;

public class Logical {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first boolean(true/false):");
		boolean x=sc.nextBoolean();
		System.out.println("Enter second boolean(true/false):");
		boolean y=sc.nextBoolean();
		System.out.println("AND:"+(x && y));
		System.out.println("OR"+(x || y));
		System.out.println("NOT:"+(!x));
		sc.close();
	}

}
