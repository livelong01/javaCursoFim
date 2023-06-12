package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Calculo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o caminho da pasta: ");
		String strPath = sc.nextLine();
		List<Calculo> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
			
			String line = br.readLine();

			while (line != null) {
				String[] values = line.split(",");
				for (String value : values) {
					System.out.println(values[1]);
				}
				String nome = values[0];
				double preco = Double.parseDouble(values[1]);
				int quantidade = Integer.parseInt(values[2]);
				list.add(new Calculo(nome, preco, quantidade));
				line = br.readLine();
			}
			
			//Boolean success = new File(strPath + "/out").mkdir(); // criar pasta
			//System.out.println(success);
			
			//BufferedWriter bw = new BufferedWriter (new FileWriter (strPath + "/out/summary.csv"));
			for (Calculo cal : list) {
				System.out.println(cal);
			}
			
		}
		catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
			}
		}
	}
