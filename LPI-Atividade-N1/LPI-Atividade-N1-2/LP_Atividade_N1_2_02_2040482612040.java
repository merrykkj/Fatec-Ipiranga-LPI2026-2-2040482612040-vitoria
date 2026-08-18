// O while foi utilizado pois não sabemos quantas vezes o laço será rodado 
// e o laço pode não ser rodado nenhuma vez

import java.util.Scanner;

public class LP_Atividade_N1_2_02_2040482612040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double total = 0;
        double media = 0;
        int quantidadeVendas = 0;
        System.out.print("Valor da venda (ou 0 para encerrar): ");
        double valorVenda = scanner.nextDouble();
        
       while (valorVenda != 0) {
           total = total + valorVenda;
           quantidadeVendas++;
           System.out.print("Valor da venda (ou 0 para encerrar): ");
           valorVenda = scanner.nextDouble();
       }
       
       if (quantidadeVendas > 0) {
           media = total / quantidadeVendas;
           System.out.printf("Total vendido no turno: R$ %.2f%n", total);
           System.out.println("Quantidade de vendas: " + quantidadeVendas);
           System.out.printf("Valor médio por venda: R$ %.2f%n", media);
       } else {
           System.out.println("Nenhuma venda registrada nesta sessão de caixa.");
       }

    } 
}
    