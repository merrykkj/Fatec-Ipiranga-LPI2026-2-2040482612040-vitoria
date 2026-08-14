import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class LP_Atividade_01_07_2040482612040
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Informe o valor A (ex.: 1.00): ");
		String valorA = scanner.nextLine();
		
		System.out.print("Informe o valor B (ex.: 0.90): ");
		String valorB = scanner.nextLine();
		
		System.out.print("Informe o valor total da compra: ");
		String valorCompra = scanner.nextLine();
		
		System.out.print("Informe o número de parcelas: ");
		int numeroParcelas = scanner.nextInt();
		
		double primitivoA = Double.parseDouble(valorA);
		double primitivoB = Double.parseDouble(valorB);
		
		double resultado = primitivoA - primitivoB;
		System.out.println("--- Demonstração da Imprecisão do padrão IEEE 754 (double) ---");
		System.out.println("Resultado esperado de 1.00 - 0.90 seria 0.10");
		System.out.println("Resultado real obtido com double: " + resultado);
	
	    BigDecimal A = new BigDecimal(valorA);
	    BigDecimal B = new BigDecimal(valorB);
	    BigDecimal resultadoAB = A.subtract(B);
	    
	    System.out.println("--- Correção exata utilizando java.math.BigDecimal ---");
        System.out.println("Resultado com BigDecimal (String Constructor): " + resultadoAB);
        BigDecimal total = new BigDecimal(valorCompra);
        
        BigDecimal parcela = new BigDecimal(String.valueOf(numeroParcelas));
        BigDecimal valorParcela = total.divide(parcela, 2, RoundingMode.HALF_UP);
	    
	    System.out.println("--- Divisão de parcelas com Escala e RoundingMode.HALF_UP ---");
        System.out.println("Compra de R$ " + valorCompra + " dividida em " + numeroParcelas + "x: R$ " + valorParcela + " por parcela.");
	}
}
