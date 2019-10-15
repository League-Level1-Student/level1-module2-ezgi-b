package _04_tea_maker;

public class TeaRunner {
	public static void main(String[] args) {
		TeaBag teabag = new TeaBag(TeaBag.PASSION_FRUIT);
		Kettle kettle = new Kettle();
		Cup mug = new Cup();
		kettle.boil();
		mug.makeTea(teabag, kettle.getWater());
	}
}
