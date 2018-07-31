package downloads;

import java.util.Arrays;
import java.util.Scanner;

public class TimeonTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxtime = sc.nextInt();
		int chores = sc.nextInt();
		int[] time = new int[chores];
		for(int i = 0; i <= chores; i++){
			time[i]=sc.nextInt();
		}
		Arrays.sort(time);
		int counter = 0;
		int index = 0;
		int total = 0;
		while(total<=maxtime){
			total = total + time[index];
			index++;
			counter++;
			
		}
		System.out.println(counter-1);

	}

}
