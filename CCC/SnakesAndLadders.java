package downloads;

import java.util.Scanner;

public class SnakesAndLadders {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int pos = 1;
		
		//while(input!=0||pos<100){
		while(input != 0 && input+pos<=100){
			pos = pos + input;
			if (pos == 54) pos = 19;
			if (pos == 90) pos = 48;
			if (pos == 99) pos = 77;
			if (pos == 9)  pos = 34;
			if (pos == 40) pos = 64;
			if (pos == 67) pos = 86;
			System.out.println("You are now on square"+pos);
			
			}
			//if(pos > 100) pos = pos - input;
		if(pos == 100) {System.out.println("You win!");
		//break;
		}
		
	}
}
