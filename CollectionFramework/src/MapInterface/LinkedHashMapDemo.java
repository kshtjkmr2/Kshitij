package MapInterface;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap< Integer,String> lmap=new LinkedHashMap<>();
		lmap.put(2, "Sarvanan");
		lmap.put(1,"Kamaru");
		lmap.put(4, "Nagaland");
		lmap.put(3, "Indiana");
		lmap.put(null, null);
		System.out.println(lmap);

	}

}
