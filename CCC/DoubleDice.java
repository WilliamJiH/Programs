package downloads;

import java.util.Scanner;

public class DoubleDice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ap = 100, dp =100;
		int round = sc.nextInt();
		int as,ds;
		for (int i = 0; i <= round; i++){
			as = sc.nextInt();
			ds = sc.nextInt();
			if(as > ds) dp = dp - as;
			else if ( ds > as) ap = ap - ds;
		}
		System.out.println(ap);
		System.out.println(dp);

	}	

}
