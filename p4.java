package np;

import java.util.*;

public class p4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("enter arry numbers");
		for(int i = 0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<=4;j++) 
		{
			System.out.println(a[j]);
		}
		System.out.println("length is "+a.length);
	}

}
