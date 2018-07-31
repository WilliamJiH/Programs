package CCC2017CLASS3;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strName = "StephenSS";
		System.out.println(strName.length());
		//the index of
		System.out.println(strName.indexOf('S'));
		//Index of non exisiting character
		System.out.println(strName.indexOf('Z'));
		//Index of sequence characters
		System.out.println(strName.indexOf("hen"));
		//return the character in a specific detail
		System.out.println(strName.charAt(0));
		//subString(Start index,enf index)
		System.out.println(strName.substring(5, 5));
		//write a program that will print the reverse version of StrPresident.
		String strPresident = "DonaldTrump";
		
		for(int i = strPresident.length()-1;i>=0;i--){
			System.out.println(strPresident.charAt(i));
		}
		System.out.println("");
		
		int num = 123;
		String strnum = Integer.toString(num);
		System.out.println(strnum.length());
		int num2 = Integer.parseInt(strnum);
		System.out.println(num2*10);
		
	}

}
