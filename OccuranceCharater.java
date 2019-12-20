package String;

import java.util.Arrays;

public class OccuranceCharater {

	public static void main(String[] args)
	{
		String s= "Rajarammohanroy";
		s=s.toUpperCase();
		char ar[]=s.toCharArray();
		Arrays.sort(ar);
		String t=new String(ar);
		while(t.length()>0)
		{
			char a=t.charAt(0);
			int occ=t.lastIndexOf(a)-t.indexOf(a)+1;
			System.out.println(t.charAt(0)+" "+occ);
			t=t.replace(""+a,"");
		}

	}

}
