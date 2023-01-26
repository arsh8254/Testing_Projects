package test.package4;
import java.util.Stack;
public class stacksdemo {

	public static void main(String[] args) {
		 Stack <String> stk = new Stack <>();
		  stk.push("america");
		  stk.push("india");
		  stk.push("ram");
		  System.out.println(stk);
		  
		  String removedelement = stk.pop();
		  System.out.println(removedelement);
		  System.out.println("remaining stack is " +stk);

	}

}
