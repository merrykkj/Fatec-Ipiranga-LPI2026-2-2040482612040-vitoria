
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class LP_Atividade_N1_1_07_2040482612040 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String valorA;
		String valorB;
		String valorCompra;
		int numeroParcelas;
		double valorAdb;
		double valorBdb;
		double resultadoQuebrado;


		System.out.print ("Informe o valor de  A (ex.: 1.00): ");
		valorA = scanner.nextLine();

		System.out.print ( " Informe o valor B (ex.: 0.90): ");
		valorB = scanner.nextLine();

		valorAdb = Double.parseDouble(valorA);
		valorBdb = Double.parseDouble(valorB);

		resultadoQuebrado= valorAdb - valorBdb;

		System.out.println ( "--- Demonstração da Imprecisão do padrão IEEE 754 (double) ---");
		System.out.println ( "Resultado esperado de " + valorA + " - " + valorB + " seria 0.10");
		System.out.println ( "Resultado real obtido com double: " + resultadoQuebrado);
		
		BigDecimal valorABigD= new BigDecimal(valorA);
		BigDecimal valorBBigD= new BigDecimal(valorB);
		BigDecimal resultadoCorreto = valorABigD.subtract(valorBBigD);
		System.out.println("--- Correção exata utilizando java.math.BigDecimal ---");
		
		System.out.println("Resultado com BigDecimal (String Constructor): " + resultadoCorreto);

		System.out.print("Informe o valor total da compra: ");
		valorCompra = scanner.nextLine();

		System.out.print("Informe o número de parcelas: ");
		numeroParcelas = scanner.nextInt();
		BigDecimal numeroParcelasBigD =new BigDecimal(numeroParcelas);
		BigDecimal valorCompraBigD = new BigDecimal(valorCompra);
		BigDecimal valorParcela = valorCompraBigD.divide(numeroParcelasBigD, 2, RoundingMode.HALF_UP); 
		

		System.out.println("--- Divisão de parcelas com Escala e RoundingMode.HALF_UP ---");
		System.out.println("Compra de R$ " + valorCompra + " dividida em " + numeroParcelas + "x: R$ " + valorParcela + " por parcela.");

		scanner.close();
	}
}
