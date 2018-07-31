package downloads;

import java.util.Scanner;

public class goodtime {

	public static int convert(int e, int d){
		int hours = e /100;
		int minutes = e % 100;
		int dhours = d /100;
		int dminutes = d % 100;
		minutes = minutes + dminutes;
		hours = hours + dhours;

		if (minutes > 59){
			hours = hours + minutes / 60;
			minutes = minutes % 60;
		}
		if (hours > 23){
			hours = hours - 24;
		}
		if (hours<0){
			hours=24+hours;
		}
		return hours * 100 + minutes;
	}	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Eastern = input.nextInt();
		System.out.println(convert(Eastern,0)+" in Ottawa");
		System.out.println(convert(Eastern,-300)+" in Victoria");
		System.out.println(convert(Eastern,-200)+" in Edmonton");
		System.out.println(convert(Eastern,-100)+" in Winnipeg");
		System.out.println(convert(Eastern,0)+" in Toronto");
		System.out.println(convert(Eastern,100)+" in Halifax");
		System.out.println(convert(Eastern,130)+" in St.John's");

	}
}