package test.package2;

public class NestedFor {

	public static void main(String[] args) {
		int number[][]= {{7,5,6} , {5,5,6} , {8,6,5}};
		for(int i=0 ; i< 3 ; i++){
		for(int j=0 ; j<3 ; j++){
			System.out.print(number[i] [j] +"   ");
		}
		System.out.println();
		}

	}

}
