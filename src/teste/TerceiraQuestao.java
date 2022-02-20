package teste;

import java.util.Scanner;

public class TerceiraQuestao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a palavra desejada: ");
		String anagram = scan.nextLine();
		int contador = 0;
		//boolean match = false;
		
		StringBuilder sb = new StringBuilder();
		sb.append(anagram);
		
		//verificar quantos pares de letras iguais
		try {
			for (int i = 0; i < sb.length(); i++) {
				String aux = String.valueOf(sb.charAt(i));
				
				for (int j = 0; j < (sb.length() - 1); j++) {
					String aux2 = String.valueOf(sb.charAt(j+1));
					
					if(aux.equals(aux2)) {
						contador++;
						sb.deleteCharAt(i);
						sb.deleteCharAt(j+1);
						
					}
				}
				
			}
			
		} catch (Exception e) {
			
		}
		
		//Imprimindo na tela os pares encontrados
		System.out.println(contador);
		
		scan.close();
	}
}
