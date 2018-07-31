package downloads;

import java.util.Scanner;

public class returninghome {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String [] direction = new String [10];
		String dir = input.next();
		int count = 0;

		while(!dir.equals("SCHOOL")){
			direction[count] = dir;
			dir = input.next();
			count++;
		}

		for (int i = 0; i < direction.length;i++){
			System.out.println(direction[i]+"\t");
		}
		System.out.println("");

		for (int i = count-1; i >=1; i--){
			//check if that is right or left
			if (direction[i].equals("R")){
				System.out.println("Turn LEFT onto " + direction[i-1]+" street.");
			}
			else if (direction[i].equals("L")){
				System.out.println("Turn RIGHT onto " + direction[i-1]+" street.");
			}
		}


		if (direction[0].equals("R")){
			System.out.println("Turn LEFT into your HOME." );
		}
		else if (direction[0].equals("L")){
			System.out.println("Turn RIGHT into your HOME." );
		}

	}

}
