package teste;

import java.util.Scanner;

public class SegundaQuestao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira a senha desejada: ");

		String senha = scan.nextLine();

		// Definindo as valida��es
		int minimoChar = senha.length();
		boolean hasNumber = false;
		boolean hasMaiuscula = false;
		boolean hasMinuscula = false;
		boolean hasCharEspecial = false;

		// la�o para varrer toda a senha e verificar caractere por caractere se atende
		// aos requisitos
		for (int i = 0; i < senha.length(); i++) {
			String aux = String.valueOf(senha.charAt(i));
			if (aux.matches("^[0-9]")) {
				hasNumber = true;
			}
			if (aux.matches("^[A-Z]")) {
				hasMaiuscula = true;
			}
			if (aux.matches("^[a-z]")) {
				hasMinuscula = true;
			}
			if (aux.matches("^[!@#$%^&*()-+]")) {
				hasCharEspecial = true;
			}

		}

		boolean isSenhaForte = hasNumber && hasMaiuscula && hasMinuscula && hasCharEspecial && minimoChar >= 6;

		// output: se n�o atender aos requisitos, ir� somar de acordo com os caracteres
		// faltantes e, se n�o atingir ao tamanho m�nimo, adicionar� ao mesmo.

		if (isSenhaForte) {
			System.out.println("Sua senha atende todos os requisitos.");
		} else {
			int contador = 0;
			if (hasNumber == false) {
				contador++;
			}

			if (hasMaiuscula == false) {
				contador++;
			}

			if (hasMinuscula == false) {
				contador++;
			}
			if (hasCharEspecial == false) {
				contador++;
			}

			int dif = 0;

			if (senha.length() + contador < 6) {
				dif = 6 - (senha.length() + contador);
				contador += dif;
			}

			System.out.println(contador);
		}

		scan.close();
	}
}
