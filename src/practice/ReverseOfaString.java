package practice;

public class ReverseOfaString {

	public static void main(String[] args) {
		String s="lakshmi";
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
		s2=s2+s.charAt(i);	
		}
		System.out.println("reverse of a string is:"+s2);

	}

}
