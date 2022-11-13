package Treta;

public class Convertor implements IConversion {

	public double convertKg(double kg) {
		return kg * 2.2;
	}

	public double convertLb(double lb) {
		return lb / 2.2;
	}

}
