package partie3;

public class Voiture {
	public int puissance;
	public int vitesse;
	public boolean estDemarre;	
	
	public Voiture() {
		puissance = 4;
		vitesse = 100;
		estDemarre = false;
	}
	public Voiture(int power)
	{
		puissance = power;
		vitesse = 130;
		estDemarre = false;
	}
	public Voiture(int power, int speed, boolean started) {
		puissance = power;
		vitesse = speed;
		estDemarre = started;
	}
}
