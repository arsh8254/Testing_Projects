package JavaTest;

public class DataTypeConversion {

	public static void main(String[] args) {
		int i=5;// 4 bytes 32 bits
		float f = 5.5f; //4 bytes
		double d =5.5; //8 bytes
		short s =5; //2 bytes
		//byte b=5; //1 bytes 8 bits -128 to 127
		long l=5l; //8 bytes
		System.out.println(l);
		System.out.println(s);
		System.out.println(d);
		System.out.println(f);
		System.out.println(i);
		
		//can i convert double in to integer
		//type casting
		double d1 = 5;//implicit type conversion
		System.out.println((int)d1);
		
		//type casting
		int k = (int)5.8;//explicitly type conversion
		System.out.println(k);
		
		char c = 'A';
		c=66;//American standard code
		System.out.println(c);
	}

}
