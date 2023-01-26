package test.package3;
import java.util.HashSet;
import java.util.Set;
public class HashSetDemo {

	public static void main(String[] args) {
		Set <String> hSet = new HashSet <String> ();
		hSet.add("A");
		hSet.add("B");
		hSet.add("C");
		hSet.add("C");
		System.out.println(hSet);
		boolean r1= hSet.add("D");
		boolean r2= hSet.add("D");
		System.out.println(hSet);
		System.out.println(r1);
		System.out.println(r2);
		for (String item: hSet) {
			System.out.println(item);
			
		}
		
		System.out.println(hSet.contains("Y"));
		System.out.println(hSet.contains("A"));
		
		
		

	}

}
