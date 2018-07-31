/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downloads;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Allen
 */
public class Anagram_Checker_2007 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String v;
		String in;
		int count=0;
		v=input.nextLine();
		in=input.nextLine();
		for (int i=0;i<in.length();i++){
			for (int j=0;j<v.length();j++){
				if (in.charAt(i)==v.charAt(j)){
					count++;
					v=v.substring(0, j).concat(v.substring(j+1));
					j=v.length();
				}
			}
		}
		if (count==in.length()){
			System.out.println("Is an anagram.");
		}
		else{
			System.out.println("Is not an anagram.");
		}
	}
}