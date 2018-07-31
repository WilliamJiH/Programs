package downloads;
import java.util.Scanner;
public class TermsOfOffice {
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		int LCM = 60;
		int x = input.nextInt();		
		int y = input.nextInt();
		int count = 0;
		for (int i = x; i <= y; i++){
			int b = i%60;
			
			if (x % 60 == b)
				System.out.println("All positions change in year " + i);
			
		}
		
	}

}
