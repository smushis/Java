package partie6;

import java.io.FileWriter;
import java.io.IOException;

public class testIO {

	public static void main(String[] args) throws IOException{
		FileWriter myFile = new FileWriter("a_ecrire.txt");
		myFile.write("Voila ma premiere ligne dans un fichier");
		myFile.close();
	}

}
