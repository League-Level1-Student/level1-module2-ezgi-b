package _06_minion;

public class Minion {
	private String name;
	private int eyes;
	private String color;
	private String master;
	Minion(String name, int eyes, String color, String master){
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}
	void setName(String n){
		name=n;
	}
	String getName() {
		return name;
	}
	void setEyes(int e){
		eyes=e;
	}
	int getEyes() {
		return eyes;
	}
	void setColor(String c){
		name=c;
	}
	String getColor() {
		return color;
	}
	void setMaster(String m){
		master=m;
	}
	String getMaster() {
		return master;
	}
}
