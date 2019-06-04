package iniJava;

public class Exercice21 {
	public static void main (String[] argv) {
		int[] intTab = new int[argv.length];
		final short[] tab1 = {1,2,3,4,5};
		char[] tab2 = {'a','b','c','d','e'};
		int i =0;
		
	    for (i=0; i < argv.length; i++) {
			 intTab[i] = Integer.parseInt(argv[i]);
		}
		for(i = 0; i < tab1.length; i++)
		{
			System.out.print(tab1[i]);
		}
		System.out.println();
		System.out.println(tab2);
		afficherTab(intTab);
	}
	public static void afficherTab(int[] tab){
		for(int i=0; i < tab.length; i++) {
			System.out.print(tab[i]);
		}
	}

}
