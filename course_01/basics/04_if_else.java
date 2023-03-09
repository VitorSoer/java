import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your salary: ");
		double salary = sc.nextDouble();

		System.out.println("Type your bonus: ");
		int bonus = sc.nextInt();

		if (salary > 0 && bonus > 0) {
			double result = (salary * bonus) / 100;
			double totalSalary = salary + result;

			System.out.printf("Bonus: %.2f | Total: %.2f", result, totalSalary);
		} else {
			System.out.println("Try again...");
		}

	}

}