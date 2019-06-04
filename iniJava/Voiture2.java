package iniJava;

public class Voiture2 {
	private int puissance;
	private int vitesse;
	private boolean estDemarre;	
	
	public Voiture2() {
		puissance = 4;
		vitesse = 100;
		estDemarre = false;
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
	
	public void Affichage() {
		int v = this.GetVitesse();
		int p = this.GetPuissance();
		boolean d = this.GetDemarrage();
		
		System.out.println("Vitesse : " + v);
		System.out.println("Puissance : " + p);
		System.out.println("Demarrage : " + d);
	}
}
