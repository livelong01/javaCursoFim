package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Agora vamos usar uma funcao stream que escreve arquivos
		 * seja texto, seja o que for. Voce pode criar arquivos se ele n existir
		 * se ele ja existir ele sera zerado e recriado.
		 * Entretanto, há uma maneira de acrescentar conteudo no arquivo existente,
		 * basta escrever new FileWriter(path, true). O true serve para adc conteudo
		 * sem apagar o que ja havia dentro dele.
		 */
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path =  "/home/jonathan/Documentos/out";
		
		try ( BufferedWriter bw = new BufferedWriter (new FileWriter (path) )) {// se eu colocar ", true" vai escrever mais 3 linhas com os textos mencionados. 
			for ( String line: lines) {
				bw.write(line); // escrever arquivo
				bw.newLine(); // pular linha por texto mencionado entre aspas.
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}