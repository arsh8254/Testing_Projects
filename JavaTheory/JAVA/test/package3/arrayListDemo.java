package test.package3;
import java.util.ArrayList;
import java.util.List;
public class arrayListDemo {

	public static void main(String[] args) {
		List <Integer> ArrayList = new ArrayList <Integer> (5);
		for (int i = 0 ; i <= 5; i++) {
		ArrayList.add (i);
		}
		System.out.println (ArrayList);
	
	ArrayList.remove(3);
	System.out.println(ArrayList);
	
//	for ( int i = 0; i < ArrayList.size(); i++){
//	System.out.println(ArrayList .get(i) +" ");
//    }
	
	for (int i : ArrayList) {
	System.out.print (i + " ");
	}
	

	}
}