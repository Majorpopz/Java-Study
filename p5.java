package np;

import java.util.*;

public class p5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s[][] = new String[3][3];
		System.out.println("enter the string");
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[i].length;j++) {
				s[i][j]=sc.next();
			}
		}
		
		for(int a=0;a<s.length;a++) {
			for(int b=0;b<s[a].length;b++) {
				System.out.println(s[a][b]);
			}
		}
	}

}
