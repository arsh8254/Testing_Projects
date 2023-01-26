package test.package5;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class StreamsDemo {

	public static void main(String[] args) {
			List <Integer> numberlist = new ArrayList<>();
			numberlist.add(10);
			numberlist.add(20);
			numberlist.add(30);
			numberlist.add(40);
			
//			List <Integer> squarelist = new ArrayList<>();
//			for (Integer i : numberlist) {
//				squarelist.add(i * i);
//			}
			
//			List <Integer> squarelist = numberlist.stream().map (x-> x*x).collect(Collectors.toList());
//			Set <Integer> squareset = new HashSet<>();
//			for (Integer i : numberlist) {
//				squareset.add(i*i);
//				
//			}
//			Set <Integer> squareset = numberlist.stream().map (x-> x*x).collect(Collectors.toSet());
//			
//			System.out.println(squareset);
			
			List <String> language = new ArrayList <>();
			language.add("java");
			language.add("python");
			language.add("scala");
			language.add("basic");
			
//			List <String> filterlist = new ArrayList<>();
//			for (String s: language) {
//				if (s.startsWith("p")) {
//				filterlist.add(s);
//				}
//			}
//			List <String> filterlist= language.stream().filter(x-> x.startsWith("p")).collect(Collectors.toList());
//			List <String> sortedlist = language.stream().sorted().collect(Collectors.toList());
//			System.out.println(sortedlist);
			
//			language.stream().forEach(y -> System.out.println(y));
			
	
					int sum = numberlist.stream().reduce(0, (ans, i)-> (ans+ i));
				System.out.println ("the sum is : " +sum);
	}
	}


