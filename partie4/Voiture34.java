package partie4;
import java.util.Date;

public class Voiture34 {
	private char nom;
	private static int nbVoitures;
	private static Voiture34[] listeVoitures = new Voiture34[10];
	private int puissance;
	private double vitesse;
	private boolean estDemarre;
	private Date dateCreation;
	
	// Vitesse
	public Voiture34(double v) {
		this.vitesse = v;
		listeVoitures[nbVoitures] = this;
		nbVoitures++;
		this.dateCreation = new Date();
	}
	public void SetVitesse(double v) {
		this.vitesse = v;
	}
	public void accelere(int v) {
		this.vitesse += v;
	}
	public double GetVitesse() {
		return this.vitesse;
	}
	
	// Autres
	public void SetDate(Date d) {
		this.dateCreation = d;
	}
	public Date GetDate(){
		return this.dateCreation;
	}
	
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
	
	public void SetDemarrage(boolean d) {
		this.estDemarre = d;
	}
	
	public int GetPuissance() {
		return this.puissance;
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
		double v = this.GetVitesse();
		int p = this.GetPuissance();
		boolean d = this.GetDemarrage();
		
		System.out.println("Vitesse : " + v);
		System.out.println("Puissance : " + p);
		System.out.println("Demarrage : " + d);
	}
}
