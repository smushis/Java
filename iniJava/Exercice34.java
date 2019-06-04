package iniJava;

public class Exercice34 {
	public static void main (String[] argv) {
		int i = 0;
		Voiture34 voiture1 = new Voiture34();
		Voiture34 voiture2 = new Voiture34();	
		voiture1.SetNom('a');
		voiture2.SetNom('b');
		System.out.println("Nb voitures : " + Voiture34.GetNbVoitures());
		while(Voiture34.GetListeVoitures()[i] != null) {
			System.out.println("Nom voiture " + (i+1) + ": " + Voiture34.GetListeVoitures()[i].GetNom());
			i++;
		}
	}
}
