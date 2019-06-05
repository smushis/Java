package partie4;

public class VehiculePrioritaire extends Voiture34 { // extends signifie que vehiculePrio est une classe fille de Voiture34
	private boolean gyrophare;
	
	public VehiculePrioritaire() {
		super(10); //super signifie que l'on accède au méthode de la classe mère (ici le constructeur)
	}
	
	public void allumeGyrophare() {
		this.gyrophare = true;
		super.accelere(10);
	}
	
	
}
