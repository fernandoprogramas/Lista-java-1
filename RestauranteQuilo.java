import java.util.Scanner;

public class RestauranteQuilo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Peso do prato (em quilos): ");
        double pesoPrato = scanner.nextDouble();
        
        double valorPagar = pesoPrato * 12.0;
        
        System.out.println("Valor a pagar: R$ " + valorPagar);
            
        scanner.close();
    }
}
