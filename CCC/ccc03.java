package cccA;
import java.util.*;
public class ccc03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//first line: the starting coordinate
		int a = input.nextInt();
		int b = input.nextInt();
		//second line: the destination coordinate
		int c = input.nextInt();
		int d = input.nextInt();
		//third line: the initial number of units of electrical charge of your battery
		int t = input.nextInt();
		
		int least = 0;
		if(a>c){
			least = least+(a-c);
		}
		else if(c>a){
			least = least+(c-a);
		}
		else{
			
		}
		if(b>d){
			least = least+(b-d);
		}
		else if(d>b){
			least = least+(d-b);
		}
		else{
			
		}
		if(t<least){
			System.out.println("N");
		}
		else if(t>least){
			if((t-least)%2==0){
				System.out.println("Y");
			}
			else if((t-least)%2!=0){
				System.out.println("N");
			}
		}
		else if(t==least){
			System.out.println("Y");
		}
	}

}
