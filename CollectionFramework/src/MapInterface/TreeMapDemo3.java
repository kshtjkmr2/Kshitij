package MapInterface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo3 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tmap=new TreeMap<>(new myComparator());
		//to do leter
		tmap.put(7, "India");
		tmap.put(3, "England");
		tmap.put(2, "Nepal");
		tmap.put(1, "USA");
		tmap.put(4, "Bangaladesh");
		tmap.put(6, "Bhutan");
		tmap.put(5, "ShriLanka");
		System.out.println(tmap);

	}

}
class myComparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return s1.compareTo(s2);
	}
	
}