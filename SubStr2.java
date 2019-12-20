package String;

import java.util.Scanner;

public class SubStr2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		System.out.println("Enter Start index");
		int start=sc.nextInt();
		System.out.println("Enter end index");
		int end=sc.nextInt();
//		 for(int i=0;i<=s.length()-1;i++)
//		 {
			 System.out.println(s.subSequence(start,end));
//		 }
		
	}

}
