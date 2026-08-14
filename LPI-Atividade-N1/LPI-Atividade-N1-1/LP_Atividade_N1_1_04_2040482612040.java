import java.util.Scanner;
public class LP_Atividade_N1_1_04_2040482612040
{
		public static final String instituicao = "FATEC Ipiranga";
		public static final int prazo_maximo_padrao = 14;
		public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Informe o número de dias do empréstimo: ");
		final int diasEmprestimo = scanner.nextInt();
		
		
		// diasEmprestimo = 20;
		devolucao(diasEmprestimo);
	}
	
	    public static void devolucao (final int diasEmprestimo) {
	    
	    if (diasEmprestimo <= prazo_maximo_padrao) {
	       System.out.println("Instituição: " + instituicao);
	       System.out.println("Prazo Máximo Padrão: " + prazo_maximo_padrao + " dias.");
	       System.out.println("Dias calculados para devolução: " + diasEmprestimo + " dias.");
	    } else {
	        System.out.println("Prazo Máximo excedido");
	    }
	}
}
