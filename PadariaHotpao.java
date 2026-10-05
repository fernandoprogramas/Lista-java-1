import java.util.Scanner;

    public class PadariaHotpao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de pães vendidos: ");
        int quantidadePaes = scanner.nextInt();
        
        System.out.println("Informe a quantidade de broas vendidas: ");
        int quantidadeBroas = scanner.nextInt();
        
        double totalVendas = (quantidadePaes * 0.12) + (quantidadeBroas * 1.50);
        double valorPoupanca = totalVendas * 0.10;
        
        System.out.println("Total arrecadado com vendas: R$ " + totalVendas);
        System.out.println("Valor a guardar na poupança: R$ " + valorPoupanca);
        
        scanner.close();
    }
}

