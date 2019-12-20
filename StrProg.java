package String;

public class StrProg {

	public static void main(String[] args) 
	{
		String s= "bsfh3???mh4dvj";
		System.out.println(trueString(s)?"YES":"NO");
		
	}

	public static boolean trueString(String str) 
	{
		boolean flag = false;
		Integer start = null;
		Integer end = null;
		for(int i = 0; i <= str.length(); i++) {
			if(str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				start = new Integer(i);
				for(int j = i+1; j <= str.length(); j++) {
					if(str.charAt(j) >= 48 && str.charAt(j) <= 57) {
						end = new Integer(j);
					}
					else {
						return flag;
					}
				}
			}
			else {
				return flag;
			}
		}	
		flag = true;
		return flag;
	}
}
