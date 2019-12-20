package String;

public class Plaindrone 
{
	public static void main(String[] args) {
		String s="abncb";
		int a=0;
		for(int i=0,j=s.length()-1;i<j;i++,j--)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				
			}
			else
			{
				a++;
			}
		}
		if(a==0)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Plaindrome");
		}
	}
}
