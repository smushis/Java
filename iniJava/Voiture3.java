package iniJava;

public class Voiture3 {
	private int puissance;
	private int vitesse;
	private boolean estDemarre;	
	
	public Voiture3() {
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
