package MapInterface;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		HashMap map=new HashMap();
		Temp t=new Temp();
		map.put(t,"India");
		System.out.println(map);
		t=null;//gc not able to destroyed Temp object if temp does not asssociated any value
		System.gc();
		Thread.sleep(5000);
		System.out.println(map);
		WeakHashMap wmap=new WeakHashMap();
		Temp t1=new Temp();
		wmap.put(t1,"India");
		System.out.println(wmap);
		t1=null;//gc destroyed Temp object if temp does not asssociated any value
		System.gc();
		Thread.sleep(5000);
		System.out.println(wmap);

	}

}
class Temp{
	String Temp="temp";
	public String toString() {		
		return Temp;
	}
	public void finalize() {
		System.out.println("Distroyed");
	}
}
