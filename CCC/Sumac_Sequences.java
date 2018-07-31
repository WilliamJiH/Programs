/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downloads;
import java.util.Scanner;


public class Sumac_Sequences {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t=input.nextInt();
		int t1=input.nextInt();
		int count=2;
		int temp;
		for (;;){
			if (t<t1){
				System.out.println(count);
				break;
			}
			else {
				count+=1;
				temp=t1;
				t1=t-t1;
				t=temp;
			}
		}
	}
}
