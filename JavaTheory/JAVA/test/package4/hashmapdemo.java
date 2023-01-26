package test.package4;
import java.util.HashMap;
import java.util.Map.Entry;
public class hashmapdemo {

	public static void main(String[] args) {
		HashMap <String, Integer> map = new HashMap <>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		System.out.println(map);
		System.out.println(map.size());
	
		if (map.containsKey("A")) {
		Integer A= map.get("A");
		System.out.println("THE VALUE FOR A=" + A);
			
	}
		for (String ke : map.keySet()) {
			 System.out.println("key: " + ke + " value : "  + map.get(ke));
		System.out.println(ke);
		}
        for (Entry<String, Integer> entry : map.entrySet()) {
        	  System.out.println("key: " + entry.getKey() +  " value: " + entry.getValue());
        	System.out.println(entry);  
        	  
          }
	}

}
