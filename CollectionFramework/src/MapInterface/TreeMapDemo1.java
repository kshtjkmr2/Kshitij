package MapInterface;

import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tmap=new TreeMap<>();
		tmap.put(7, "India");
		tmap.put(3, "England");
		tmap.put(2, "Nepal");
		tmap.put(1, "USA");
		tmap.put(4, "Bangaladesh");
		tmap.put(6, "Bhutan");
		tmap.put(5, "ShriLanka");
		tmap.put(8, null);//for value we can put null
		//tmap.put(null, "jamika");
		//this line gives null pointer exception
		//Default sorting order based on key value 
		System.out.println(tmap);
	}

}
