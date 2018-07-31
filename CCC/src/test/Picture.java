package test;

import java.util.Scanner;

public class Picture {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=1,l,w;
		while(a!=0){
			System.out.println("Enter number of pictres: ");
			a = sc.nextInt();
			l = (int) Math.round(Math.sqrt(a));
			while(l!=0){
				l = l-l;
			}
			w = a / 1;
			System.out.println("Minimum perimeter is "+2 * l + 2 * w+ " with dimensions "+ w+ " X "+ w);
			System.out.println();
		}

	}

}
