package String;

public class AllSubStr {

	public static void main(String[] args) 
	{
		String s= "12345";
		for(int k=1;k<s.length();k++)
		{
			for(int i=0;i<s.length()-k;i++)
			{
				System.out.println(s.substring(i,i+k));
			}
		}
	}
}
