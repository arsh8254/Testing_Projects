package test.package3;
import java.util.LinkedList;
public class linkedListdemo {

	public static void main(String[] args) {
		LinkedList <String> List = new LinkedList <String> ();
		List.add ("A");
		List.add ("B");
		List.add ("C");
		List.addFirst ("H");
		List.addLast ("K");
		List.add (2, "Y");
		System.out.println(List);
		List.remove (3);
		List.remove ("H");
		System.out.println(List);
		
		
		

	}

}
