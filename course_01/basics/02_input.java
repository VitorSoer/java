import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// int = nextInt() | double = nextDouble() | Full string = nextLine()
		String x;
		x = sc.next();

		System.out.println("Value: " + x);

		sc.close();
	}

}