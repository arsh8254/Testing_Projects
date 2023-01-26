package JavaTest;

public class Student {

	String name;
	int roll;
	
	Student(String n ,int r)
	{
		name = n;
		roll = r;
	}
	public static void main(String[] args) {
		Student arsh = new Student("aryan" , 20);
		System.out.println(arsh.name);
		System.out.println(arsh.roll);

	}

}
