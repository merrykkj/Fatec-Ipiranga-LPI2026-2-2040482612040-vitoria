import java.util.Scanner;


public class LP_Atividade_N1_1_09_2040482612040
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Informe a nota final do aluno: ");
		double notaFinal = scanner.nextDouble();
		
		String situacao;
		
		if (notaFinal >= 6.0) {
		    situacao = "Aprovado";
		} else {
		    situacao = "Reprovado";
		}
		
		// String ternario = (notaFinal >= 6) ? "Aprovado" : (notaFinal >= 4) ? "Exame" : "Reprovado";
		// Não deve ser utilizado por causa da legibilidade, torna-se muito confuso em primeira vista
		// o que faz com quem leia o código não entenda bem tantos caracteres iguais juntos.
		String ternario = (notaFinal >= 6.0) ? "Aprovado" : "Reprovado";
	
	
		System.out.println("--- Abordagem 1: Estrutura Condicional Tradicional (if-else) ---");
		System.out.println("Situação (if-else): " + situacao);
		System.out.println("--- Abordagem 2: Operador Ternário Simples ---");
		System.out.println("Situação (Ternário): " + ternario);

	}
	
}
