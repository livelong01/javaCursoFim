package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
		
		System.out.println("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader (new FileReader(path))) {
			
			Set<LogEntry> set = new HashSet<>(); //hashSet foi escolhido, pq a ordem n importa e é o mais rapido.
			
			String line = br.readLine();
			while (line != null ) {
				
				String[] fields = line.split(" ");
				String username = fields[0];
				LocalDateTime moment = LocalDateTime.parse(fields[1], fmt);
				
				set.add(new LogEntry(username, moment));
				/*
				 * Se eu tentar adc algum nome reeptido, o proprio
				 * set barra a entrada dele.
				 */
				line = br.readLine();
			}
			
			System.out.println("Total users: " + set.size());
			
		} catch (IOException e ) {
			System.out.println("Error: " + e.getMessage());
		
		}
		sc.close();
	}

}
