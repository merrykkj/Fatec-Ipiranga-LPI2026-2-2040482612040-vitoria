import java.util.Scanner;

public class LP-Atividade-01-01-2040482612040
{
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        byte idade; // 8 bits com intervalo de -128 a 127
        short faltas; // 16 bits com intervalo de -32.768 a 32.767
        int matriculaId; // 32 bits com intervalo de valores -2.147.483.648 a 2.147.483.647
        long codigoNacional; // 64 bits com intervalo -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        float notaTrabalho; // 32 bits com intervalo de aproximadamente ±1.4E-45 a ±3.4028235E38
        double notaProvaFinal; // 64 bits com intervalo de aproximadamente ±4.9E-324 a ±1.7976931348623157E308
        char conceitoFinal; // 16 bits com intervalo 0 a 65.535
        boolean aprovado;   // 1 bit e guarda apenas true ou false 

        System.out.print("Idade do Aluno: ");
        idade = scanner.nextByte();

        System.out.print("Número de Faltas: ");
        faltas = scanner.nextShort();

        System.out.print("Matrícula ID: ");
        matriculaId = scanner.nextInt();

        System.out.print("Código Nacional do Estudante: ");
        codigoNacional = scanner.nextLong();

        System.out.print("Nota do Trabalho: ");
        notaTrabalho = scanner.nextFloat();

        System.out.print("Nota da Prova Final: ");
        notaProvaFinal = scanner.nextDouble();

        System.out.print("Conceito Final do Aluno: ");
        conceitoFinal = scanner.next().charAt(0);

        System.out.print("Aluno está Aprovado (true/false): ");
        aprovado = scanner.nextBoolean(); 

        System.out.println(" --- Dados do Aluno Fictício ---");
        System.out.println("Idade do aluno: " + idade);
        System.out.println("Número de faltas: " + faltas);
        System.out.println("Matrícula ID: " + matriculaId);
        System.out.println("Código Nacional do Estudante: " + codigoNacional);
        System.out.println("Nota do Trabalho: " + notaTrabalho);
        System.out.println("Nota da Prova Final: " + notaProvaFinal);
        System.out.println("Conceito Final do Aluno: " + conceitoFinal);
        System.out.println("Aluno está aprovado (true/false): " + aprovado);

    }
}