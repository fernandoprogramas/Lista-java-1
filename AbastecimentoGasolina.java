import java.util.Scanner;

public class AbastecimentoGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Preço do litro da gasolina: ");
        double precoLitro = scanner.nextDouble();
        
        System.out.print("Valor do pagamento: ");
        double valorPagamento = scanner.nextDouble();
        
        double litrosAbastecidos = valorPagamento / precoLitro;
        
        System.out.print("Litros abastecidos: " + litrosAbastecidos);
        scanner.close();
    }
}
