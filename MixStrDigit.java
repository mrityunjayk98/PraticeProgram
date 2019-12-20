package String;

public class MixStrDigit {
	public static void main(String[] args) {
		String s="ab5vs2da8sbc3";
		String d="";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=47&&s.charAt(i)<=57)
			{
				d=d+s.charAt(i);
			}
			else
			{
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(d+" "+s1);
	}

}
