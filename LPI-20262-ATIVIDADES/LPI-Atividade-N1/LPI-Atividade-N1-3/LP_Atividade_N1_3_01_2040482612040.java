import java.util.Scanner;

public class LP_Atividade_N1_3_01_2040482612040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de leituras: ");
        int quantidadeLeituras = scanner.nextInt();
        double[] temperatura = new double[quantidadeLeituras];
        
        for (int i = 0; i < quantidadeLeituras; i++) {
            System.out.print("Temperatura (°C): ");
            temperatura[i] = scanner.nextDouble();
        }
        
        System.out.println("–- Leituras Registradas –-");
        for (int i = 0; i < quantidadeLeituras; i++) {
            System.out.println("Leitura [" + i + "]: " + temperatura[i] + "°C");
        }

        System.out.println("–- Acesso Direto --");
        System.out.println("Primeira leitura (indice 0): " + temperatura[0] + "°C");
        System.out.println("Ultima leitura (indice " + (quantidadeLeituras - 1) + "): " + temperatura[quantidadeLeituras - 1] + "°C");

        double maior = temperatura[0];
        int indiceMaior = 0;
        double menor = temperatura[0];
        int indiceMenor = 0;

        for (int i=1; i<quantidadeLeituras; i++) {
            if ( temperatura[i] > maior ){
                maior = temperatura[i];
                indiceMaior = i;
            } 
            
            if ( temperatura[i] < menor ){
                menor = temperatura[i];
                indiceMenor = i;
            } 

        }
        
        System.out.println("–- Busca Linear: Extremos –-");
        System.out.println("Maior temperatura: " + maior + "°C (indice " + indiceMaior + ")");
        System.out.println("Menor temperatura: " + menor + "°C (indice " + indiceMenor + ")");
        System.out.print("Temperatura crítica de alerta (°C): ");
        double temperaturaCritica = scanner.nextDouble();
        
        
        int indiceCritico = -1;
        
        for(int i=0; i<quantidadeLeituras; i++) {
            if (temperatura[i] >= temperaturaCritica) {
                indiceCritico = i;
                break;
            }

        }
        System.out.println("–- Busca Linear: Alerta –-");
        if (indiceCritico != -1) {
            System.out.println("Alerta: temperatura critica atingida na leitura de índice " + indiceCritico + " (" + temperatura[indiceCritico] + "°C).");
        } else {
            System.out.println("Nenhuma leitura atingiu ou ultrapassou a temperatura critica informada.");
        }
    }
}
