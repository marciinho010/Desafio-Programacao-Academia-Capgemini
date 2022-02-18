package aplicacao;

public class Questao01 {

	public static void main(String[] args) {

		int n = 6;
		String[] escada = new String[n];
		
		for(int i = 0 ; i <= n - 1 ; i++) {
			escada[i] = " ";

		}
		for(int i = n -1  ; i >= 0 ; i--) {
			escada[i] = "*";

			for(int j = 0 ; j <= n-1 ; j++) {
				System.out.print(escada[j]);
				
			}
			System.out.println();
		}
	}

}