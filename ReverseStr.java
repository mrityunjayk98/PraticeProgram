package String;

import java.util.*;

public class ReverseStr
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String");
		String s= sc.nextLine();
		String t="";
		for(int i=0;i<s.length();i++)
		{
			t=s.charAt(i)+t;
		}
		//System.out.println(t);
		if(s.equals(t))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	
	}

}
