package np;

import java.util.*;
import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("thomas");
		a.add("aldrin");
		a.add("kichu");
		
		
		a.set(0, "nintappan");
		a.remove(2);
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		

	}

}
