package cccA;

import java.util.Scanner;

public class ccc02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int shift = sc.nextInt();
		int b = a;
		
		for(int i = 0; i < shift; i++){
			b *= 10;
			a = a + b;
			
		}
		System.out.println(a);	
		
	}

}
