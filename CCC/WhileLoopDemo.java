package CCC2017CLASS3;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num%2==0){
			System.out.println(num);
			num=sc.nextInt();
		}
	}

}
