package Vtora;

public class MainClass {

	public static void main(String[] args) {
		Triagolnik t = new Triagolnik();
		t.setA(2);
		t.setB(3);

		System.out.println("Hipotenuzata na triagolnikot so strani a=" + t.getA() + " i b="
				+ t.getB() + " iznesuva " + t.hipotenuza() + ".");

	}

}
