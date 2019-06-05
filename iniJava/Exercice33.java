package iniJava;

public class Exercice33 {
	public static void main (String[] argv) {
		Voiture3 voiture1 = new Voiture3(); //def new voiture
		Voiture3 voiture2 = new Voiture3();
		
		voiture1.SetDemarrage(false);
		voiture1.SetPuissance(50);
		voiture1.SetVitesse(130);
		
		voiture2.SetDemarrage(false);
		voiture2.SetPuissance(100);
		voiture2.SetVitesse(130);
		
		voiture1.Demarre();
		voiture2.Demarre(120);
		
		System.out.println(voiture1);
		voiture1 = null;
		System.gc();
	}
}
