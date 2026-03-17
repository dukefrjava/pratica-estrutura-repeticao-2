import java.util.Scanner;

public class estruturaRepeticao {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.print("Entre um número: ");
		int numero = scanner.nextInt();
		
		int i = 0;
		while(i <= 10) {
			System.out.println(numero + " x " + i + " = " + numero*i);
			i++;
		}
		
		limparBuffer();
		
		String resposta;
		do {
			System.out.print("Deseja [Continuar] ou [Sair]? ");
			resposta = scanner.nextLine();
			if (resposta.equals("Continuar")) {
				System.out.print("Entre uma palavra ou uma frase: ");
				String palavraFrase = scanner.nextLine();
				System.out.println(palavraFrase);
			} else if (resposta.equals("Sair"))
				System.out.println("Obrigado por utilizar nosso sistema, espero que tenha gostado");
			else 
				System.out.println("Resposta inválida");
		} while (resposta.equals("Continuar"));

	}

	static void limparBuffer() {
		scanner.nextLine();
	}
}
