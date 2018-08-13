package MapInterface;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

	public static void main(String[] args) {
		SortedMap<Integer,Integer> smap=new TreeMap<Integer,Integer>();
		smap.put(2, 15);
		smap.put(4, 53);
		smap.put(1, 35);
		smap.put(5, 53);
		smap.put(3, 25);
		System.out.println(smap);

	}

}
