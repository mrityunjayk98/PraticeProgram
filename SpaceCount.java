package String;

public class SpaceCount 
{
	public static void main(String[] args) 
	{
		String s= "this a my laptop";
		int n=1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				n++;
			}
		}
		System.out.println(n);
	}
}
