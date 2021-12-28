package np;

import java.util.Scanner;
import java.util.*;

public class reverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word to swap");
	    String s=sc.next();
	    String ch="";
	    for(int j=s.length()-1;j>=0;j--)
	    {
		ch = ch + s.charAt(j);
	    }
		System.out.println("reverse\n"+ch);
	}

}
