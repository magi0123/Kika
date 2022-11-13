package Kolok1;

public class Rakometar extends Sportist {
	public int brojNaOdigraniNatprevari;

	public Rakometar(String ime, String prezime, int godinaNaRagjanje, int godisnaZarabotuvacka,
			int brojNaOdigraniNatprevari) {
		this.ime = ime;
		this.prezime = prezime;
		this.godinaNaRagjanje = godinaNaRagjanje;
		this.godisnaZarabotuvacka = godisnaZarabotuvacka;
		this.brojNaOdigraniNatprevari = brojNaOdigraniNatprevari;
	}

	public double danokr() {
		if (brojNaOdigraniNatprevari < 20) {
			return 0.07 * godisnaZarabotuvacka;
		} else {
			return 0.11 * godisnaZarabotuvacka;
		}

	}
}
