import java.util.Scanner;
public class LP_Atividade_N1_1_05_2040482612040
{
		public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Estoque inicial: ");
		final int estoque = scanner.nextInt();
		System.out.print("Quantidade de entrada: ");
		final int qtdEntrada = scanner.nextInt();
		System.out.print("Quantidade de saída 1: ");
		final int qtdSaida1 = scanner.nextInt();
		System.out.print("Quantidade de saída 2: ");
		final int qtdSaida2 = scanner.nextInt();
		System.out.print("Estoque mínimo: ");
		final int estoqueMinimo = scanner.nextInt();
		System.out.print("Tamanho do lote (caixa): ");
		final int tamanhoLote = scanner.nextInt();
		int estoqueAtual = estoque;
        System.out.println("Estoque inicial: " + estoque);
		estoqueAtual += qtdEntrada;
		System.out.println("Após entrada (+" + qtdEntrada + "): " + estoqueAtual + " unidades.");
	    estoqueAtual -= qtdSaida1;
	    System.out.println("Após saída (-" + qtdSaida1 + "): " + estoqueAtual + " unidades.");
	    estoqueAtual -= qtdSaida2;
		System.out.println("Após outra saída (-" + qtdSaida2 + "): " + estoqueAtual + " unidades.");
		final boolean abaixo = estoqueAtual < estoqueMinimo;
		System.out.println("O nível de estoque atual (" + estoqueAtual + ") está abaixo do mínimo (" + estoqueMinimo + ")? " + abaixo);
		final int foraCaixa = estoqueAtual % tamanhoLote;
		System.out.println("Unidades fora de caixas fechadas de " + tamanhoLote + ": " + foraCaixa);
		final boolean estoqueFracionado = (foraCaixa == 0);
		System.out.println("O estoque está perfeitamente fracionado em caixas completas? " + estoqueFracionado);
		    
		}
}