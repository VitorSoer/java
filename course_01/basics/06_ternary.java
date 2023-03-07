public class intro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Type your age: ");
		int age = sc.nextInt();

		var result = (age < 18) ?  "soda" : "beer";
		
		System.out.println("Drink " + result);
		
	}

}