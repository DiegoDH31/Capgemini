package teste;

import java.util.Scanner;

public class PrimeiraQuestao {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número desejado: ");
		
		int n = scan.nextInt();
		StringBuilder sb = new StringBuilder();
		
		//Criando uma string do tamanho solicitado
		for (int i = 0; i < n; i++) {
			sb.append(" ");
		}
		
		//Substituindo os espaços por *
		for (int i = 0; i < n; i++) {
			sb.deleteCharAt(n-(i+1));
			sb.append("*");
			System.out.println(sb);
		}
		
		scan.close();
	}
}
