package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employees;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter full file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List <Employees> list = new ArrayList<>();
			
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employees (fields[0],fields[1] ,Double.parseDouble(fields[2])));
				line = br.readLine();
 			}
		System.out.println("Enter salary: ");
		double salaryChose = sc.nextDouble();
		
		System.out.println("Email of people whose salary is more than " + String.format("%.2f", salaryChose) + ":");
		List<String> emails = list.stream()
				.filter(p -> p.getSalary() > salaryChose)
				.map(p -> p.getEmail())
				.sorted()
				.collect(Collectors.toList());
		emails.forEach(System.out::println);
		
		double sumT = list.stream()
				.filter(p -> p.getName().charAt(0) == 'M')
				.map(p -> p.getSalary())
				.reduce(0.0, (x , y) -> x + y);
		System.out.println("Sum of salary of people whose name starts with 'M' : " + sumT);
		
		}catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}