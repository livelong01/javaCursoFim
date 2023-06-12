package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "/home/jonathan/Documentos/in";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
				
			String line = br.readLine(); // ele le a primeira linha
			
			while (line != null ) { // fazer um while para ele ler enquanto n chega na ultima linha, que é "null".
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}

	}

}
