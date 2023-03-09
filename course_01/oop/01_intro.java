public class Character {
	String name;
	String attack;
	
	void figth () {
		System.out.printf("Character: %s | Attack: %s", name, attack);
	}
}

public class Program {

	public static void main(String[] args) {
		Character witcher = new Character();
		
		witcher.name = "Voldemort";
		witcher.attack = "Avada kedavra";
		
		witcher.figth();
	}

}