package Week3.day1;

public class Bmw extends Car {

	public void airBag() {
		System.out.println("i'm in BMW");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bmw bm= new Bmw();
		bm.airBag();
		bm.soundHorn();
		bm.applyBreak();
		bm.switchOnAc();
	}

}
