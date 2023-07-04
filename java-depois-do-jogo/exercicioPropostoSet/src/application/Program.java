package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Set<Students> mat = new HashSet<>();
		
		System.out.print("How many students for course A?");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			mat.add(new Students(sc.nextInt()));
		}
		
		System.out.print("How many students for course B?");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			mat.add(new Students(sc.nextInt()));
		}
		
		System.out.print("How many students for course C?");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			mat.add(new Students(sc.nextInt()));
		}

		System.out.println("Total Students: " + mat.size());
		
		sc.close();
	}

}
