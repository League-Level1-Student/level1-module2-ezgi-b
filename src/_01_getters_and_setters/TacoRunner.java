package _01_getters_and_setters;

import javax.swing.JOptionPane;

public class TacoRunner {
	public static void main(String[] args) {
		Taco taco = new Taco();
		taco.setMeat(JOptionPane.showInputDialog("What type of meat do you want in your taco?"));
		System.out.println(taco.getMeat());
		taco.setSauce(JOptionPane.showInputDialog("What type of sauce do you want on your taco?"));
		System.out.println(taco.getSauce()+" sauce");
	}
}
