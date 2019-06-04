package partie5;

public class Carre extends Forme {
	private double cote;
	
	public Carre() {
		this.cote = 7;
	}

	@Override
	public double perimetre() {
		return this.cote*4;
	}

	@Override
	public double surface() {
		return this.cote*this.cote;
	}

}
