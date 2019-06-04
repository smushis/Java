package partie5;

public class Avion extends Object{
	public double vitesse;
	public double puissance;
	public Avion(double v, double p) {
		this.vitesse = v;
		this.puissance = p;
	}
	public boolean equals(Object o) {
		if (o instanceof Avion) {
			if(((Avion) o).vitesse == this.vitesse) {
				return true;
			}
			else {
				return false;
			}	
		}
		else {
			return false;
		}
	}
}

