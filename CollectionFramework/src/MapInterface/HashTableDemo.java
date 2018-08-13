package MapInterface;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Object, Object> htable = new Hashtable<>(35);
		htable.put(new person(23), "Kshitij");
		htable.put(new person(13), "Anjulataj");
		htable.put(new person(33), "Kiran");
		htable.put(new person(3), "Prasanna");
		htable.put(new person(15), "Anupam");
		htable.put(new person(11), "Arpita");
		System.out.println(htable);
		//{15=Anupam, 3=Prasanna, 13=Anjulataj, 23=Kshitij, 11=Arpita, 33=Kiran}
	}

}
class person{
	int id;
	public person(int id) {
		this.id=id;
	}
	public String toString() {
		return id+"";
	}
	public int hashCode() {
		return id;
	}
}