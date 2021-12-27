package np;

import java.util.Scanner;

public class method {
	
	static int add(int a,int b)
	{
		 return a + b;
	}
	
	static int sub(int a,int b)
	{
		return a - b;
	}
	
	static int mul(int a,int b)
	{
		return a * b;
	}
	
	static int div(int a,int b)
	{
		return a / b; //return the values to the function easer to output
	    // sysytem.out out kittunna  ella valusumm retun cheyyan pattum
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(i == 0)
		{
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		System.out.println("menu  1-Add 2-Sub 3-mul 4-div");
		int no = sc.nextInt();
		switch(no)
		{
		case 1:System.out.println(add(a,b));
		break;
		case 2:System.out.println(sub(a,b));
		break;
		case 3:System.out.println(mul(a,b));
		break;
		case 4:System.out.println(div(a,b));
		break;
		}
		if(i==0)
		{
			System.out.println("enter 0 to continue or 1 to stop");
			i=sc.nextInt();
		}
		else 
		{
			i=1;
		}
		}
	}

}
