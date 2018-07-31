/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downloads;
import java.util.Scanner;

public class Jerseys {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int J = input.nextInt();
		int A = input.nextInt();
		int [] j = new int[J];
		int [] s = new int[A];
		int [] n = new int[A];
		int count=0;
		for (int i=0;i<J;i++){
			String in=input.next();
			switch (in) {
			case "L":
				j[i]=3;
				break;
			case "S":
				j[i]=1;
				break;
			default:
				j[i]=2;
				break;
			}
		}
		for (int i=0;i<A;i++){
			String in =input.next();
			switch (in) {
			case "L":
				s[i]=3;
				break;
			case "S":
				s[i]=1;
				break;
			default:
				s[i]=2;
				break;
			}
			n[i]=input.nextInt();
		}
		for (int i=0;i<A;i++){
			if (j[n[i]-1]>=s[i]){
				count+=1;
				j[n[i]-1]=0;
			}
		}
		System.out.println(count);
	}
}
