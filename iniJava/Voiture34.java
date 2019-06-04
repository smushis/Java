package iniJava;

public class Voiture34 {
	private char nom;
	private static int nbVoitures;
	private static Voiture34[] listeVoitures = new Voiture34[10];
	private int puissance;
	private int vitesse;
	private boolean estDemarre;
	
	public void SetNom(char n) {
		this.nom = n;
	}
	public char GetNom() {
		return this.nom;
	}
	
	public static int GetNbVoitures() {
		return nbVoitures;
	}
	public static Voiture34[] GetListeVoitures() {
		return listeVoitures;
	}
	
	public Voiture34() {
		listeVoitures[nbVoitures] = this;
		nbVoitures++;
	}
	
	public void SetPuissance(int p) {
		this.puissance = p;
	}
	
	public void SetVitesse(int v) {
		this.vitesse = v;
	}
	
	public void SetDemarrage(boolean d) {
		this.estDemarre = d;
	}
	
	public int GetPuissance() {
		return this.puissance;
	}
	
	public int GetVitesse() {
		return this.vitesse;
	}
	
	public boolean GetDemarrage() {
		return this.estDemarre;
	}
	
	public void Demarre() {
		this.estDemarre = true;
	}
	
	public void Demarre(int vit) {
		this.estDemarre = true;
		this.vitesse = vit;
	}
	
	public void Affichage() {
		int v = this.GetVitesse();
		int p = this.GetPuissance();
		boolean d = this.GetDemarrage();
		
		System.out.println("Vitesse : " + v);
		System.out.println("Puissance : " + p);
		System.out.println("Demarrage : " + d);
	}
}
