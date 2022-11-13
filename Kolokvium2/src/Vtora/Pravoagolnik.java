package Vtora;

public class Pravoagolnik {

	private int a;
	private int b;

	public Pravoagolnik() {
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
	
	public double dijagonala () {
		return Math.sqrt(a*a+b*b);
	}
}


