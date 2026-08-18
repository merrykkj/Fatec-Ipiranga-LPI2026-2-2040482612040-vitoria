//O for é mais adequado porque logo no inicio do programa o usuário diz 
// quantas vezes ele deve rodar através da quantidade de alunos
import java.util.Scanner;

public class LP_Atividade_N1_2_01_2040482612040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double soma = 0;
        double media = 0;
        double maiorNota = 0;
        System.out.print("Quantidade de alunos na turma: ");
        int quantidadeAlunos = scanner.nextInt();
        
        for (int i = 0; i<quantidadeAlunos; i++ ) {
            System.out.print("Nota do aluno: ");
            double nota = scanner.nextDouble();

            soma = soma + nota;
            if(nota > maiorNota){
                maiorNota = nota;
            } 
    }
    media = soma / quantidadeAlunos;
    
    System.out.println("Soma total das notas: " + soma);
    System.out.println("Média da turma: " + media);
    System.out.println("Maior nota da turma: " + maiorNota); 
    } 
    
}