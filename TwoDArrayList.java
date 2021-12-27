package np;

import java.util.ArrayList;

public class TwoDArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("thomas");
		a.add("aldrin");
		a.add("kichu");
		
		ArrayList<String> b = new ArrayList<String>();
		
		b.add("nidhinoombi");
		b.add("arayoomphi");
		b.add("vypinoomphi");
		
		ArrayList<ArrayList<String>> ab = new ArrayList<>();
		ab.add(a);
		ab.add(b);
		
		for(int i=0;i<ab.size();i++) {
			for(int j=0;j<ab.get(i).size();j++) {
				System.out.println(ab.get(i).get(j));
			}
		}

	}

}
