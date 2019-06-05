package partie5;

public abstract class Forme {
	public abstract double perimetre();  // Abtract (virtual en c++): signifie que la fonction peut être défini différémment dans chacune des classes filles
	public abstract double surface();
	public double etalement() {
		double peri = perimetre();
		return 16*surface() / (peri*peri);
	}
}
