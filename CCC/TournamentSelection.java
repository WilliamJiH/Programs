package downloads;

import java.util.Scanner;

public class TournamentSelection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countA = 0;
		int countB = 0;
		
		for(int i = 1; i <= 6; i++){
			String selc = sc.next();
			if(selc.equals("W")){
				countA++;
			}
			else{
				countB++;
			}
		}
		if(countA == 5 || countA == 6){
			System.out.println("1");
		}
		else if(countA == 3 || countA == 4){
			System.out.println("2");
		}
		else if(countA == 1 || countA == 2){
			System.out.println("3");
		}
		else if(countB == 6){
			System.out.println("-1");
		}
		
	}

}
