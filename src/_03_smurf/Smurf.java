package _03_smurf;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 3&4 see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + ".";
	}

	public void eat() {
		System.out.println(name + " is eating Smurfberries.");
	}

	
	public String getHatColor() {
		if(name=="Papa Smurf") {
			return name + "'s hat is red.";
		}else if(name=="Grandpa Smurf") {
			return name + "'s hat is gold.";
		}else {
			return name + "'s hat is white.";
		}
	}

	
	public String isGirlOrBoy() {
		if(name=="Smurfette"||name=="Sassette Smurfling"||name=="Nanny Smurf") {
			return name + " is a girl.";
		}else {
			return name + " is a boy.";
		}
	}

}


