package downloads;
import java.util.Scanner;
public class ccc15j2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		int counterh = 0;
		int counters = 0;

		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==':'){
				if(str.substring(i,i+3).equals(":-)")){
					counterh++;
				}
				else if(str.substring(i,i+3).equals(":-(")){
					counters++;
				}
			}
		}
		if(counterh>counters)System.out.println("happy");
		else if(counterh<counters)System.out.println("sad");
		else if(counterh!=0 && counterh==counters)System.out.println("unsure");
		else System.out.println("none");

	}
}
