import java.util.Scanner;
public class LP_Atividade_01_06_2040482612040
{
		public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Informe o nome de usuário: ");
		final String texto = scanner.nextLine();
		
		
		//A partir do momento que a primeira expressão for falsa o && para de testar.
		//Já o & tenta testar as duas expressões e se o texto for nulo,
		//ele olha o tamanho o que faria o programa quebrar.
		if (texto != null && texto.length() > 0) {
		    System.out.println("Usuário válido fornecido: " + texto);
		} else {
		    System.out.println("Entrada rejeitada: O texto está nulo ou vazio.");
		}
		
	}
}