package String;
import java.util.Scanner;
public class AmitiPro {


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		//String s="hdg4??cg5sghb";
		int n=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)>='0' && s.charAt(i)<='9' )
				{
					n=n+Integer.parseInt(""+s.charAt(i));
				}
			}
			if(  n<10)
			{
				if( s.contains("??")) 
				{
				System.out.println("YES");
				}	
			}
			else 
			{
				System.out.println("NO");
				
			}
	}

}
