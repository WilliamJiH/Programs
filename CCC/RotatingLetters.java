package CCC2017CLASS3;

import java.util.Scanner;

public class RotatingLetters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine().toUpperCase();
		System.out.println(word);
		if(word.replaceAll("[IOSHZXN]","").equals("")){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}

	}
}
