package partie4;

public class VehiculePrioritaire extends Voiture34 {
	private boolean gyrophare;
	
	public VehiculePrioritaire() {
		super(10);
	}
	
	public void allumeGyrophare() {
		this.gyrophare = true;
		super.accelere(10);
	}
	
	
}
