package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "/home/jonathan/Documentos/in";
		
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr); // usa o fileReader no buffered para deixar mais rapido e flexivel o sistema de leitura de arquivos.
			//OU pode fazer assim: br = new BufferedReader(new FileReader(path));
			
			String line = br.readLine(); // ele le a primeira linha
			
			while (line != null ) { // fazer um while para ele ler enquanto n chega na ultima linha, que é "null".
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			}
			catch (IOException e){
				e.printStackTrace();
				}
			}
	}

}