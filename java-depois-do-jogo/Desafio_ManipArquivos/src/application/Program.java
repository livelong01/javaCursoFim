package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Calculo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Nesse programa, foi impressindivel fazer um try e catch para a etapa de 
		 * reader e outro para a etapa de whrite, pois sem isso nao era escrito nada 
		 * no documento. Só funcionava se eu usasse o "bw.close", que fechava o write
		 * manualmente. Depois que fiz um try/catch para os casos isoladamente, nao precisei
		 * escrever o .close e funcionou perfeitamente.
		 */
		
		System.out.print("Entre com o caminho da pasta: ");
		String strPath = sc.nextLine();
		List<Calculo> list = new ArrayList<>();
		File path = new File(strPath); // criar arquivo para poder pegar o seu caminho
		
		try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
			
			String line = br.readLine();

			while (line != null ) {
					String[] values = line.split(",");
					String nome = values[0];
					double preco = Double.parseDouble(values[1]);
					int quantidade = Integer.parseInt(values[2]);
					list.add(new Calculo(nome, preco, quantidade));	
					line = br.readLine();
			}
			
			Boolean success = new File(path.getParent() + "/out").mkdir(); // criar pasta
			System.out.println("A pasta foi criada: " + success);
			
			try (BufferedWriter bw = new BufferedWriter (new FileWriter (path.getParent() + "/out/summary.csv"))){
				for (Calculo cal : list) {
					bw.write(cal.toString());
					bw.newLine();
				}
				//bw.close();
				
			    System.out.println("Arquivo gravado com sucesso!");
			    
			    
			}catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
			
		}
		catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
			}
		}
	}
