import java.util.Scanner;

public class CalculoDiasVida {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();
        
        int diasDeVida = idade * 365;
        
        System.out.print(nome.toUpperCase() + ", você já viveu " + diasDeVida + " dias.");
        scanner.close();
    }
}

