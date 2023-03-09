import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numberToCalc;
		numberToCalc = sc.nextInt();

		int count = 0;

		while (count <= 10) {
			int result = numberToCalc * count;

			System.out.printf("%d * %d = %d %n", numberToCalc, count, result );
			count += 1;
		}
		
	}

}
