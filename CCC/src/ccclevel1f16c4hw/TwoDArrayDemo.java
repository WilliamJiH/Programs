package ccclevel1f16c4hw;
import java.util.Scanner;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int [] [] arr1 = new int [3] [3];
		int [] [] arr2 = new int [3] [4];
		//recall
		int [] arr3 = {1,2,3};
		int [] [] arr4 = {{1,2,3},{4,5,6},{7,8,9}};
		int [] [] arr5 = {{1,2},{3,4,5}};
		//the size of 2d array
		System.out.println(arr5.length);
		//access the size of a specific row
		System.out.println(arr5[1].length);
		for (int i = 0; i < arr5.length; i++){
			for (int j = 0; j < arr5[i].length;j++){
				System.out.print(arr5[i][j]+"\t");
			}
			System.out.println("");
		}

	}

}
