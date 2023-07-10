package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader (new FileReader(path))) {
			
			Map<String, Integer> eleicao = new LinkedHashMap<>(); //hashSet foi escolhido, pq a ordem n importa e é o mais rapido.
			
			String line = br.readLine();
			while (line != null ) {
				
				String[] fields = line.split(",");
				String candidato = fields[0];
				int votos = Integer.parseInt(fields[1]);
				
				if (eleicao.containsKey(candidato)) {
					int candVotos = eleicao.get(candidato);
					eleicao.put(candidato, votos + candVotos);
				}
				else {
				eleicao.put(candidato, votos);
				}
				
				line = br.readLine();
			}
			
			for (String e : eleicao.keySet() ) {
				
				System.out.println(e + ": " + eleicao.get(e));
			}
			
			
		} catch (IOException e ) {
			System.out.println("Error: " + e.getMessage());
		
		}
		sc.close();
	}

	}

