package MapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashmapDemo2 {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(2, 5);
		map.put("kamal", "kumar");
		map.put(3, "Sikala");
		map.put("chamira", 3);
		System.out.println(map);
		Set a=map.keySet();
		System.out.println(a);
		Collection c=map.values();
		System.out.println(c);

	}

}
