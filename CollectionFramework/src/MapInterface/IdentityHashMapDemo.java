package MapInterface;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		Integer I1=new Integer(10);
		Integer I2=new Integer(10);
		HashMap<Integer,String> map=new HashMap<>();
		map.put(I1, "India");
		map.put(I2, "England");
		/*In case of HashMap .equal() method is comparing duplicate key as content and
		 * in both integer object having same value and I1,I2 having same value*/
		System.out.println(map);//{10=England}
		IdentityHashMap<Integer, String> imap=new IdentityHashMap<>();
		imap.put(I1, "India");
		imap.put(I2, "England");
		/*in case of IdentityHashMap (==) operator compare references and I1,I2 having
		 * different references*/
		System.out.println(imap);//{10=India, 10=England}

	}

}
