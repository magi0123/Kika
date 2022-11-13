package Treta;

public class MainClass {

	public static void main(String[] args) {
		Convertor c = new Convertor();
		double cm, in;
		cm=5;
		in=3;
		
		System.out.println(cm +" cm iznesuvaat " + c.convertCm(cm) + " in.");
		System.out.println(in +" in iznesuvaat " + c.convertIn(in) + " cm.");

	}

}
