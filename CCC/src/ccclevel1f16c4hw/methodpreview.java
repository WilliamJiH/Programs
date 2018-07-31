package ccclevel1f16c4hw;

import java.util.Scanner;

public class methodpreview {

	public static int sum (int a, int b){
		return a + b;
	}
	public static int GCF (int a, int b){
		//return the GCF of a and b
		//either a > b or b < a
		for (int i = a; i >=1; i--){
			if(a% i ==0 && b % i ==0)return i;
		}
		return 1;
	}

	public static int LCM (int a, int b){
		//return the LCM of a and b
		return (a*b)/GCF(a,b);
	}
	public static String reverse (String S){
		//return the reverse version of a string
		String str = "";
		for (int i = S.length()-1;i>=0;i--){
			str = str + str.charAt(i);
		}
		return str;
	}
	public static boolean isPalindrome(String S){
		//return true if S is a Palindrome else false
		//"racecar" is a Palindome.
		return S.equals(reverse(S));
	}

	public static String Americanadian(String S){
		String vowels = "aeiouy";
		String lastword = S.substring(S.length()-3,S.length());
		if(vowels.indexOf(S.charAt(S.length()-3))==-1 && lastword.equals("or")){
			return S.substring(0, S.length()-2)+"our";
		}
		return S;
	}
	public static int arraysum(int [] arr){
		//return the sum of the elements in the array
		int sum = 0;
		for (int i = 0; i < arr.length;i++){
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println(sum(10,5));
		int x = sum (10,5);
		System.out.println(x);
		System.out.println(GCF(10,20));
		System.out.println(GCF(20,10));
		System.out.println(LCM(25,10));

		int num = sc.nextInt();
		int den = sc.nextInt();
		if (num % den == 0)System.out.println(num/den);
		else if (num > den){
			System.out.println(num/den + " "+(num % den)/GCF(num,den)/GCF(num,den));
		}
		else{
			System.out.println((num % den)/(GCF(num,den))+ "/" + den(GCF(num,den)));
		}
	}
	private static int den(int gcf) {
		// TODO Auto-generated method stub
		return 0;
	}
}


