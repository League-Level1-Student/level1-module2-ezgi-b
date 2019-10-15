package _01_getters_and_setters;

public class PersonRunner {
	public static void main(String[] args) {
		Person teen = new Person();
		teen.setName("Hawkette");
		teen.setSuperPower("flight");
		System.out.println(teen.getName() + " has mad " + teen.getSuperpower() + " skills!");
		
		Person geezer = new Person();
		geezer.setName("Acceleration Man");
		geezer.setSuperPower("super-speed");
		System.out.println(geezer.getName() + " has mad " + geezer.getSuperpower() + " skills!");
		
		Person baby = new Person();
		baby.setName("Diaper-boy");
		baby.setSuperPower("invisibility");
		System.out.println(baby.getName() + " has mad " + baby.getSuperpower() + " skills!");
		
	}
}

