package ccc;

import java.lang.reflect.Array;
import java.util.Arrays;

public class soringArrays {

	public static void main(String[] args) {
		int[] arr = {100,-100,98,76,45,13,21};
		Arrays.sort(arr);
		for(int i = 0; i < arr.length;i++){
			System.out.println(arr[i]+"\t");
		}
		System.out.println("");

	}

}
