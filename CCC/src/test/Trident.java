package test;

import java.util.Scanner;

public class Trident {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tine length: ");
		int TL = sc.nextInt();
		System.out.println("Enter tine spacing: ");
		int TS = sc.nextInt();
		System.out.println("Enter handle length: ");
		int HL = sc.nextInt();
		
		
		int arr[][] = new int[TL][TS];
		for(int i = 0; i < TL;i++){
			System.out.print("*");
			for(int j = 0; j < TS; j++){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = 1; j < TS+1; j++){
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		for(int i = 0; i < 2*TS+3;i++){
			System.out.print("*");
		}
		System.out.println();
		
		for(int i = 0; i < HL; i++){
			for(int j = 0; j < TS+1; j++){
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
	}

}
