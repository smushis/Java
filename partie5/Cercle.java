package partie5;

public class Cercle extends Forme {
	private double rayon;
	
	public Cercle() {
		rayon = 5;
	}

	@Override
	public double perimetre() {
		return this.rayon*2*3.14;
	}

	@Override
	public double surface() {
		return this.rayon*this.rayon*3.14;
	}

}
