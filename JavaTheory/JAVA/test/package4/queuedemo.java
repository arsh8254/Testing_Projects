package test.package4;
import java.util.PriorityQueue;
import java.util.Queue;
public class queuedemo {

	public static void main(String[] args) {
		Queue <String> qu= new PriorityQueue <>();
		qu.add ("ramesh");
		qu.add ("shyam");
		qu.add ("astha");
		qu.add ("radhe");
        System.out.println(qu);
        
        qu.remove();
        System.out.println(qu);
//        head of the element is removed here
        
        String head = qu.peek();
        System.out.println(head);
        
        head = qu.poll();
        System.out.println(head);
        System.out.println(qu);
        
        
	}

}
