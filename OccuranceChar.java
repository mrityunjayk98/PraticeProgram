package String;

import java.util.Arrays;
import java.util.Scanner;

public class OccuranceChar {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String s=sc.nextLine();
		char ar[]=s.toCharArray();
		Arrays.sort(ar);
		String t=new String(ar);
		while(t.length()>0)
		{
			char pc=t.charAt(0);
			int occ=t.lastIndexOf(pc)-t.indexOf(pc)+1;
			System.out.println(t.charAt(0)+" "+occ);
			t=t.replace(""+pc,"");
		}
	}

}
