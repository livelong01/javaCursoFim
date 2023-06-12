package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		// Essa operacao .getName pega somente o nome do arquivo e despreza o caminho.
		System.out.println("getName: " + path.getName()); 
		// Essa funcao despreza o nome e deixa so o caminho.
		System.out.println("getParent: " + path.getParent());
		// se vc quiser todo o caminho usa a getPath
		System.out.println("getPath: " + path.getPath());
		
		// existem outras funcoes q vc pode usar pra aprender.
		// esse .delete apaga o arquivo q vc quiser.
		System.out.println("getPath: " + path.delete());
		sc.close();
	}

}
