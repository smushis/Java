package partie4;

public class Exercice41 {
	public static void main (String[] argv) {
		VehiculePrioritaire vehP1 = new VehiculePrioritaire();
		vehP1.allumeGyrophare();
		vehP1.accelere(10);
		System.out.println("Nb voitures : " + Voiture34.GetNbVoitures());
		System.out.println("Vitesse de Prio1  : " + vehP1.GetVitesse());
		// Vitesse = 30 car VitesseBase = 10  + accelere dans allumeGyro =10 + accelere(10)
	}
}
