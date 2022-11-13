package Prva;

public class Voz extends Transport {

	public double struja;
	public double cenaS;

	public Voz(double tezina, int dolzina, double struja, double cenaS) {
		super(tezina, dolzina);

		this.struja = struja;
		this.cenaS = cenaS;
	}

	public double presmetka1() {
		return struja * cenaS;
	}

}
