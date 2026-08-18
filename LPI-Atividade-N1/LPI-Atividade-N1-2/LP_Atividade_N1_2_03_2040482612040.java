//Foi utilizado do-while porque o programa precisa rodar no mínimo uma vez
import java.util.Scanner;

public class LP_Atividade_N1_2_03_2040482612040
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
	    int tentativas = 0;
	    int pinDigitado;
	    do {
	        
		System.out.print("Informe o PIN de acesso: ");
		pinDigitado = scanner.nextInt();
		tentativas++;
		if (pinDigitado != 1234) {
		System.out.println("PIN incorreto. Tente novamente");
}
	    } while (pinDigitado != 1234);
	    
	    System.out.println("Acesso concedido! Você utilizou " + tentativas + "tentativa(s)");
	}
}
