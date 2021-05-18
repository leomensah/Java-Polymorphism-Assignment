class Monster{
	
	String name;
	
	public String attack(String name) {
		return "This is monster Attack";
	}
	
}

class waterMonster extends Monster{
	
	public String attack(String name) {
		return "This is "+ name +" Attack";
	}
}

class fireMonster extends Monster{
	public String attack(String name) {
		return "This is "+ name +" Attack";
	}
}

class stoneMonster extends Monster{
	public String attack(String name) {
		return "This is "+ name +" Attack";
	}
}

public class Q2 {

	public static void main(String[] args) {
		
		waterMonster water = new waterMonster();
		System.out.println(water.attack("Water Monster"));
		
		fireMonster fire = new fireMonster();
		System.out.println(fire.attack("Fire monster"));
		
		stoneMonster stone = new stoneMonster();
		System.out.println(stone.attack("Stone Monster"));
		
		
	}

}
