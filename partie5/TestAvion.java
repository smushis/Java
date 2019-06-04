package partie5;

public class TestAvion {

	public static void main(String[] args) {
		Avion avion1 = new Avion(10,20);
		AvionElectrique avion2 = new AvionElectrique(10,20);
		System.out.println("Comparaison : " + avion1.equals(avion2));
	}

}
