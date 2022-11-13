package Prva;

public class MainClass {

	public static void main(String[] args) {
		Voz v = new Voz (5000, 1000, 3.5, 10);
		Brod b = new Brod (9000, 1000, 7.5, 20);
		
		System.out.println("Brod:");
		System.out.println("Tezinata na tovarot: " + b.tezina +"kg.");
		System.out.println("Dolzina na patot: " + b.dolzina + "km.");
		System.out.println("Cena na transportot: " + b.presmetka2() + "denari.\n");
		
		System.out.println("Voz:");
		System.out.println("Tezinata na tovarot: " + v.tezina +"kg.");
		System.out.println("Dolzina na patot: " + v.dolzina + "km.");
		System.out.println("Cena na transportot: " + v.presmetka1() + "denari.");

	}

}
