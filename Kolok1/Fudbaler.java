package Kolok1;

public class Fudbaler extends Sportist {
	public String pol;

	public Fudbaler(String ime, String prezime, int godinaNaRagjanje, int godisnaZarabotuvacka, String pol) {
		this.ime = ime;
		this.prezime = prezime;
		this.godinaNaRagjanje = godinaNaRagjanje;
		this.godisnaZarabotuvacka = godisnaZarabotuvacka;
		this.pol = pol;

	}

	public double danokf() {
		return 0.05 * godisnaZarabotuvacka;
	}
}
