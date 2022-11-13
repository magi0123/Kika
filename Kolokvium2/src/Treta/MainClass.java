package Treta;

public class MainClass {

	public static void main(String[] args) {
		Convertor c = new Convertor();
		double kg, lb;
		kg = 4;
		lb = 4;

		System.out.println(kg + " kg iznesuvaat " + c.convertKg(kg) + " lb.");
		System.out.println(lb + " lb iznesuvaat " + c.convertLb(lb) + " kg.");
	}
}