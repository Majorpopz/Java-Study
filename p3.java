package np;

import java.util.*;

public class p3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		System.out.println("menu  1-Add 2-Sub 3-mul 4-div");
		int no = sc.nextInt();
		sc.close();
		if (no == 1)
		{
			int s = a + b;
			System.out.println("sum is :"+s);
		}
		else if (no == 2)
		{
			int sub = a - b;
			System.out.println("sub :"+sub);
		}
		else if (no == 3)
		{
			int m = a * b;
			System.out.println("multiply :"+m);
		}
		else if (no == 4)
		{
			int d = a / b;
			System.out.println("division :"+d);
		}

	}

}
