package String;

import java.util.Scanner;

public class UpperCAse 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String s= sc.nextLine();
		System.out.println("Enter n");
		int n =sc.nextInt();
		String t="";
		if(s.length()>n)
		{
			for(int i=1;i<=n;i++)
			{
				t=s.charAt(s.length()-1)+t;	
				s=s.replace(s.charAt(s.length()-1)+"","");
			}
			for(int i=0;i<s.length();i++)
			{
				t=t+s.charAt(i);
			}
			System.out.println(t);
		}
		else {
			System.out.println("Limit me raho");
		}
		
	}

}
