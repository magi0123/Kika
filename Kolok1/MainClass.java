package Kolok1;

public class MainClass {

	public static void main(String[] args) {
		Fudbaler f = new Fudbaler("Gjoko", "Doncev", 2000, 60000, "maski");
		Rakometar r = new Rakometar("Pangule", "Meckaro", 1999, 12000, 20);

		System.out.println(
				"Fudbalerot " + f.ime + " " + f.prezime + ", roden vo " + f.godinaNaRagjanje + " godina e od " + f.pol
						+ " pol, zarabotuva " + f.godisnaZarabotuvacka + " i plakja danok od " + f.danokf() + ".");
		System.out.println("Rakometarot " + r.ime + " " + r.prezime + ", roden vo " + r.godinaNaRagjanje
				+ " godina ima odigrano " + r.brojNaOdigraniNatprevari + " natprevari, zarabotuva "
				+ r.godisnaZarabotuvacka + " i plakja danok od " + r.danokr() + ".");
	}

}
