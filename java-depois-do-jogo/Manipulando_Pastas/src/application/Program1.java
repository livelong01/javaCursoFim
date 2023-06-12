package application;

import java.io.File;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File (strPath);
		
		File[] folders = path.listFiles(File::isDirectory); // uma funcao dentro de outra
															//O listFiles fará uma lista de arquivos
															// o File::isDirectory vai selecionar para a lista todas as pastas, ou seja, tudo q for true.
		System.out.println("Folders: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files:  ");
		for ( File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "/subdir").mkdir(); // maneira de criar uma subpasta dentro de umm caminho dado. MKDIR = make a directory
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
	}

}