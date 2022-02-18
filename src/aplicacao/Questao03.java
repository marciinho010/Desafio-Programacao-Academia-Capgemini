package aplicacao;

import java.util.ArrayList;
import java.util.Arrays;

public class Questao03 {

	public static void main(String[] args) {

		String palavra = "ifailuhkqq";

		ArrayList<String> subStrings = new ArrayList<String>();
		ArrayList<String> anagrama = new ArrayList<String>();
		char[] proximoSubstring = null;
		char[] subStringAtual = null;
		int quantidade = 0;

		for (int i = 0; i <= palavra.length(); i++) {
			for (int y = i + 1; y <= palavra.length(); y++) {
				subStrings.add(palavra.substring(i, y));
			}
		}

		for (int i = 0; i < subStrings.size(); i++) {
			for (int y = i + 1; y < subStrings.size(); y++) {
				if (subStrings.get(i).length() == subStrings.get(y).length()) {
					proximoSubstring = subStrings.get(y).toCharArray();
					Arrays.sort(proximoSubstring);
					subStringAtual = subStrings.get(i).toCharArray();
					Arrays.sort(subStringAtual);
					if (Arrays.equals(proximoSubstring, subStringAtual)) {
						quantidade++;
						anagrama.add(subStrings.get(i));
						anagrama.add(subStrings.get(y));

					}
				}
			}
		}
		System.out.println(quantidade);

	}
}
