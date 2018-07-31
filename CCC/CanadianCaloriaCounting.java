package CCC2017CLASS2;

import java.util.Scanner;

public class CanadianCaloriaCounting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [4];
		int [] burger = {461,463,420,0};
		int [] fries = {100,57,70,0};
		int [] drink = {130,160,118,0};
		int [] desrt = {167,266,75,0};
		int be = sc.nextInt();//bueger
		int so = sc.nextInt();//side order
		int dr = sc.nextInt();//drink 
		int de = sc.nextInt();//desert
		int tcalorie = burger[be-1] + fries[so-1] + drink[dr-1] + desrt[de-1];
		System.out.println("Your total calorie count is "+tcalorie+".");
		

	}

}
