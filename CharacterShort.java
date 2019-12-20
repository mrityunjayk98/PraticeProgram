package String;

import java.util.Arrays;

public class CharacterShort 
{
	public static void main(String[] args) 
	{
		String s="hello";
		char ar[]=s.toCharArray();
		Arrays.sort(ar);
		String res=new String(ar);
		System.out.println(res);
		
	}

}
