package ccclevel1f16c4hw;

import java.util.Scanner;

public class ASCIIdemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char x1 = 'A';
		int y1 = x1;
		System.out.println((char)(int)(x1)+3);
		String strName = "Donald";
		for(int i =0;i < strName.length();i++){
			System.out.println((char)((int)(strName.charAt(i))+3));
		}
		String fun = "ZEBRA";
		
	}

}
