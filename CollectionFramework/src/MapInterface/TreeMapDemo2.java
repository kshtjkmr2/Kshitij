package MapInterface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tmap=new TreeMap<>(new myComparator());
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
class myComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer I1, Integer I2) {
		Integer i1=I1;
		Integer i2=I2;
		/*if(i1>i2) {
			return -1;
		}
		else if(i1<i2) {
			return +1;
		}
		return 0;*/
		return i2.compareTo(i1);
	}
	
}

