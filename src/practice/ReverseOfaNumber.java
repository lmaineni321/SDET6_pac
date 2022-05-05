package practice;

public class ReverseOfaNumber {

	public static void main(String[] args) {
		int n=123,rev=0,rem;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		System.out.println("reverse of a number is:"+rev);

	}

}
