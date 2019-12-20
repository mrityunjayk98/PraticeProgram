package String;

public class Sub
{
	public static void main(String[] args) {
		String s="ramayan";
		while(s.length()>3)
		{
			System.out.println(s.substring(0,3));
				s=s.replace(s.charAt(0)+"","");
		}
	}

}
