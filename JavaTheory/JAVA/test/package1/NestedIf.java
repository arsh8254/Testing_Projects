package test.package1;

public class NestedIf {
	public static void main(String[] args) {
		int i=50;
		if (i==50) {
			System.out.println("i is equal to 50");
			if (i< 70) {
				System.out.println("i is less than 70");
				if (i> 70) {
					System.out.println("i is greater than 70");
				}
			}
		}
	}
}
