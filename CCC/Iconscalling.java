package downloads;
import java.util.*;
public class Iconscalling {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int scale = sc.nextInt();
		String space = "";
		String star = "";
		String astric = "";

		for (int i = 0; i < scale; i++){
			space = space + " ";
			star = star + "x";
			astric = astric + "*";
		}
		for (int i = 0; i< scale; i++){
			System.out.println(astric + star + astric);
		}
		for (int i = 0; i< scale; i++){
			System.out.println(space + star + star);
		}
		for (int i = 0; i< scale; i++){
			System.out.println(astric + space + astric);
		}

	}
}
