package downloads;

import java.util.Scanner;

public class specialday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x == 2 && y == 18){
			System.out.println("Special");
		}
		//x==2  and y<18
		else if(x ==2 && y < 18){
			System.out.println("Before");
		}
		//x==2  and y>18
		else if(x == 2 && y > 18){
			System.out.println("After");
		}
		
		else if (x <2){
			System.out.println("Before");
		}
		else if (x > 2){
			System.out.println("After");
		}
		

	}

}
