package Prva;

public class Brod extends Transport{

	public double nafta;
	public double cenaN;
	
	public Brod (double tezina, int dolzina, double nafta, double cenaN) {
		super(tezina, dolzina);
		this.nafta = nafta;
		this.cenaN = cenaN;
	}
	
	public double presmetka2 () {
		return nafta * cenaN;
	}
}
