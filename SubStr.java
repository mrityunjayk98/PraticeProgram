package String;

public class SubStr
{
	public static void main(String[] args) 
	{
		String s="ramayan";
//		int k=3;
		for(int k=3;k<=s.length();k++)
		{
			for (int i=0;i<=k ;i++)
			{
				System.out.println(s.substring(i,i+k));
			}
		}
	}
}
