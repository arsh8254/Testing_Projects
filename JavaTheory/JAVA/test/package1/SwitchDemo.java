package test.package1;

public class SwitchDemo {

	public static void main(String[] args) {
		int number= 1;
		String name;
		switch (number) {
		case 1:
			name="ram";
			break;
		case 2:
			name="shyam";
			break;
			default:
				name="invalid number";
		}
		System.out.println(name);		
		
		

	}

}
