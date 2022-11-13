package Vtora;

public class Triagolnik {
	private int a;
	private int b;

	public Triagolnik() {
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double hipotenuza() {
		return a * a + b * b;

	}
}
