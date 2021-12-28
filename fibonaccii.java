package np;

import java.util.*;

public class fibonaccii {

	public static void main(String[] args) 
	{
		int i,s1=0,s2=1,s;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		System.out.println("inna pidichooo");
		System.out.print(s1+" "+s2);
		for(i=0;i<=a-3;i++)
		{
			s=s1+s2;
			System.out.print(" "+s);
			s1=s2;
			s2=s;
				
		}


	}

}
