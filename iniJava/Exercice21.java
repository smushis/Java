package iniJava;

public class Exercice21 {
	public static void main (String[] argv) {  // Definition du main
		int[] intTab = new int[argv.length]; // Création d'un tableau de taille : longueur argv 
		final short[] tab1 = {1,2,3,4,5}; // final désigne constant 
		char[] tab2 = {'a','b','c','d','e'};
		int i =0;
		
	    for (i=0; i < argv.length; i++) {
			 intTab[i] = Integer.parseInt(argv[i]); // parseInt => string to int
		}
		for(i = 0; i < tab1.length; i++)
		{
			System.out.print(tab1[i]); //pour afficher dans la console
		}
		System.out.println(); //pour afficher dans la console avec retour à la ligne
		System.out.println(tab2);
		afficherTab(intTab);
	}
	public static void afficherTab(int[] tab){ // static signigie que la méthode appartient à la classe et pas à l'objet de la classe
		for(int i=0; i < tab.length; i++) {
			System.out.print(tab[i]);
		}
	}

}
