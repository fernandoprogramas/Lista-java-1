import java.util.Scanner;

public class FabricaCamisetas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantidade de camisetas pequenas vendidas: ");
        int qtdPequenas = scanner.nextInt();
        
        System.out.println("Quantidade de camisetas médias vendidas: ");
        int qtdMedias = scanner.nextInt();
        
        System.out.println("Quantidade de camisetas grandes vendidas: ");
        int qtdGrandes = scanner.nextInt();
        
        double totalArrecadado = (qtdPequenas * 10) + (qtdMedias * 12) + (qtdGrandes * 15);
        
        System.out.println("Valor total arrecadado: R$ " + totalArrecadado);
        
        scanner.close();
    }
}