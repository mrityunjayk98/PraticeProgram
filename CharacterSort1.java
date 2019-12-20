package String;

public class CharacterSort1 {
	public static void main(String[] args) {
		 String s = "bcfaed";
		   char a[]=s.toCharArray();
		   char b[]=new char[a.length];
		   int count=0;
		   for(int i=0;i<a.length;i++)
		   {
		       count=0;
		       for(int j=0;j<a.length;j++)
		       {
		       if(a[i]>a[j])
		       {
		       count++;
		       }
		       }
		       b[count]=a[i];
		   }
		   for(char x:b)
		   {
		       System.out.print(x);
		   }
	}

}
