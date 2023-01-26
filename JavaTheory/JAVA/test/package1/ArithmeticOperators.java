package test.package1;

public class ArithmeticOperators {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int result = x + y;
		System.out.println(result);
		int original_result = result;
		result = result - 1;
		System.out.println(original_result + " - 1 = " + result);
		original_result = result;
		result = result * 2;
		System.out.println(original_result +" * 2 = " + result);
		original_result = result;
		result = result / 2 + 8;
		System.out.println(original_result +" / 2 + 8 = " +result);
		original_result = result;
		result = result % 7;
		System.out.println(original_result +" % 7 = " + result);
	
	}

}
