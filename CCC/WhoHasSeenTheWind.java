package downloads;
import java.util.*;
public class WhoHasSeenTheWind {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = 0;
		double A = -6*Math.pow(t, 4)+h*Math.pow(t, 3)+2*Math.pow(t, 2)+t;
		while (A > 0 && t < m){
			A = -6*Math.pow(t, 4)+h*Math.pow(t, 3)+2*Math.pow(t, 2)+t;
			t++;
		}
		if (A <=0){
			System.out.println("The baloon first touches ground at:\n"+(t-1));
		}
		else{
			System.out.println("The balloon does not "
                    + "touch ground in the given time.");
		}

	}

}
