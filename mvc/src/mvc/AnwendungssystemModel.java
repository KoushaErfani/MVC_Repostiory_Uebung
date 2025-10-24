package mvc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AnwendungssystemModel {
	
	public String getUeberschrift(){
		 return "Hallo";
		 } 
	public void schreibInDatei(String text) throws IOException {
		FileWriter fw = new FileWriter("test.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(text);
		bw.flush();
		bw.close();
		
		
		
	}

}
