package aplicacao;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		System.out.println("Senha:");
		String senha = scanner.next();

		if(senha.length() < 6) {
			System.out.println(6 - senha.length());
		}else {
			if(validaSenha(senha)) {
				System.out.println("senha segura!.");
			}else {
				System.out.println("Preencha a senha com os critérios Informado!. ");
			}
		}
		scanner.close();
	}


	public static boolean validaSenha(String senha) {

		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[!@#$%^&*()-+])" + "(?=\\S+$).{6}$";

		Pattern p = Pattern.compile(regex);

		if (senha == null) {
			return false;
		}

		Matcher m = p.matcher(senha);

		return m.matches();
	}
}
