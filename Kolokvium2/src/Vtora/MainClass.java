package Vtora;

public class MainClass {
	
public static void main (String[] args) {
	Pravoagolnik p = new Pravoagolnik ();
	p.setA(4);
	p.setB(5);
	
	System.out.println("Dijagonalata na pravoagolniot so strani a=" + p.getA() + " i b=" + p.getB() + " iznesuva " + p.dijagonala() + ".");
	
}

}
