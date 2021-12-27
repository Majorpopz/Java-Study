package np;

import java.util.*;

public class p2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int v=1;
		while(v==1) {
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		
		System.out.println("menu  1-Add 2-Sub 3-mul 4-div");
		int no = sc.nextInt();
			switch(no) {
			case 1:
				int s = a + b;
				System.out.println("sum is :"+s);
				break;
			case 2:
				int sub = a - b;
				System.out.println("sub :"+sub);
				break;
			case 3:
				int m = a * b;
				System.out.println("multiply :"+m);
				break;
			case 4:
				int d = a / b;
				System.out.println("division :"+d);
				break;
		}
			System.out.println("do you want to continue ? 0for no 1 yes");
			v=sc.nextInt();
		

	}
		System.out.println("Thenks");

 }
}
