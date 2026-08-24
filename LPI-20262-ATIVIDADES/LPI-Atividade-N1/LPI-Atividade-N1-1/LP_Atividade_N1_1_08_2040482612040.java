import java.util.Scanner;

public class LP_Atividade_N1_1_08_2040482612040 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double valorTotalReais;
	    int numeroParcelas;
	    long valorTotalCentavos;
	    long valorParcelaCentavos;
	    double valorParcelaReais;

	    System.out.print("Informe o valor total da compra em reais: ");
	    valorTotalReais = sc.nextDouble();
	    System.out.print("Informe o número de parcelas: ");
	    numeroParcelas = sc.nextInt();
	    
	    
	    valorTotalCentavos = Math.round(valorTotalReais * 100);
	    System.out.println("--- Calculadora Financeira Escalar (Mapeamento em Centavos) ---");
        System.out.println("Valor total convertido: " + valorTotalCentavos + " centavos.");
        valorParcelaCentavos = valorTotalCentavos / numeroParcelas;
        
        valorParcelaReais = valorParcelaCentavos / 100.0;
        System.out.println("Divisão de R$" + valorTotalReais + " por " + numeroParcelas + " em centavos: " + valorParcelaCentavos + " centavos por parcela.");
        System.out.println("Valor convertido para exibição: R$ " + valorParcelaReais);
        
        sc.close();
	}}
