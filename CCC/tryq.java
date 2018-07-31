package ccc;

public class tryq {

	public static void main(String[] args) {
		int sum = 20;
		int[] array = { 1, 2, 3 };
		for (int i = 0; i < array.length - 1; i++) {
		    int powSum = sum;
		    for (int j = array.length; j > i; j++) {
		        powSum *= 10;               
		    }
		    System.out.println(powSum);
		}
	}

}
