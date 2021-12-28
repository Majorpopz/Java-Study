package np;

import java.util.*;

public class palindrom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		int t = a;
		int sum = 0,b;
		
		while (a > 0)
		{
			b = a%10;
			sum=(sum*10)+b;
			a=a/10;
		}
		
		
		if (sum == t)
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("palindrom adikk myree");
		}

	}

}
