package JavaTest;
import java.util.Scanner;
public class OddNumber {

	public static void main(String[] args) {
		System.out.println("input number");
		Scanner input = new Scanner(System.in);
		int i =input.nextInt();
		
		if (i==0)
			System.out.println("nothing");
		else if (i%2==0)
			System.out.println("even number");
		else
			System.out.println("odd number");

	}

}
