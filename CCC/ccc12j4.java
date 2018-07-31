package CCC2017CLASS4;

import java.util.Scanner;

public class ccc12j4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		String word =  sc.next();
		String decrypt = "";
		for(int i = 0; i < word.length(); i++){
			int shift = 3*(i+1)+key;
			int ascii = (int)(word.charAt(i)-shift);
			if(ascii>=65&&ascii<=90){
				decrypt = decrypt + (char)(ascii);
			}
			else{
				decrypt = decrypt + word.charAt(i);	
			}
		}

	}

}
