/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downloads;
import java.util.ArrayList;
import java.util.Scanner;

public class Its_Cold_Here {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList num = new ArrayList();
		ArrayList name = new ArrayList();
		int low=201;
		for (int i=0;i<1;i--){
			name.add(input.next());
			num.add(input.nextInt());
			if (name.get(name.size()-1).equals("Waterloo")){
				i=3;
			}
		}
		for (int i=0;i<name.size();i++){
			if ((Integer)num.get(i)<low){
				low=(Integer)num.get(i);
			}
		}
		System.out.println(name.get(num.indexOf(low)));
	}
}
