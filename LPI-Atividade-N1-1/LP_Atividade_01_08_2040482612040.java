import java.util.Scanner;


public class LP_Atividade_01_08_2040482612040
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Informe o valor total da compra em reais: ");
		double valorTotalReais = scanner.nextDouble();
		System.out.print("Informe o número de parcelas: ");
		int numeroParcelas = scanner.nextInt();
		
		 long totalCentavos = (long) (valorTotalReais * 100);
		
		long centavosParcela = totalCentavos / numeroParcelas;
		
		double valorExibido = centavosParcela / 100.00;
		
		System.out.println("--- Calculadora Financeira Escalar (Mapeamento em Centavos) ---");
        System.out.println("Valor total convertido: " + totalCentavos + " centavos.");
        System.out.println("Divisão de R$" + valorTotalReais + " por " + numeroParcelas + " em centavos: " + centavosParcela + " centavos por parcela.");
        System.out.println("Valor convertido para exibição: R$ " + valorExibido);

		
	}
}
