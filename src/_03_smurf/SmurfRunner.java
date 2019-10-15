package _03_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf handy = new Smurf("Handy Smurf");
		System.out.println(handy.getName());
		handy.eat();
		Smurf smurfette = new Smurf("Smurfette");
		System.out.println(smurfette.getName());
		System.out.println(smurfette.isGirlOrBoy() + " " + smurfette.getHatColor());
		Smurf sassette = new Smurf("Sassette Smurfling");
		System.out.println(sassette.getName());
		System.out.println(sassette.isGirlOrBoy() + " " + sassette.getHatColor());
		Smurf papa = new Smurf("Papa Smurf");
		System.out.println(papa.getName());
		System.out.println(papa.isGirlOrBoy() + " " + papa.getHatColor());
		Smurf nanny = new Smurf("Nanny Smurf");
		System.out.println(nanny.getName());
		System.out.println(nanny.isGirlOrBoy() + " " + nanny.getHatColor());
		Smurf grandpa = new Smurf("Grandpa Smurf");
		System.out.println(grandpa.getName());
		System.out.println(grandpa.isGirlOrBoy() + " " + grandpa.getHatColor());
		Smurf brainy = new Smurf("Brainy Smurf");
		System.out.println(brainy.getName());
		System.out.println(brainy.isGirlOrBoy() + " " + brainy.getHatColor());
	}
}
