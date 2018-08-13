package MapInterface;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo1 {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(3, "Kshitij");
		map.put(1,"Ganesh");
		map.put(2, "Suresh");
		map.put(5,"Gignesh");
		map.put(4, "Kiran");
		System.out.println(map);
		Set<Integer> s1=map.keySet();
		System.out.println(s1);
		Collection<String> c=map.values();
		System.out.println(c);
		Set<Entry<Integer,String>> s2=map.entrySet();
		System.out.println(s2);
		System.out.println(map.size());
		System.out.println(map.containsKey(3));
		Iterator<Entry<Integer,String>> itr=s2.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer,String> me=(Map.Entry<Integer,String>)itr.next();
			System.out.println(me.getKey()+"  "+me.getValue());
		}

	}

}
