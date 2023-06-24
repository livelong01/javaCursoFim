package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		PrintService<String> ps = new PrintService<>();
		
		System.out.print("How many values ?");
		int n = sc.nextInt();
		
		//ps.addValue("Maria");
		/*
		 * Agora q pus Integer ele da error se eu tentar adc
		 * string, ele dá o type safety, avisando q tem algo 
		 * de errado.
		 */
		
		for ( int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}
		
		ps.print();
		String x =
				//(Integer) //
				ps.first();
		/*
		 * ALem disso, agora n precisa fazer o casting do 
		 * integer, pois o type safety garante q n vai ser
		 * um inteiro adc no first.
		 */
		System.out.println("First: "+ x);
		
		
		sc.close();
	}

}
