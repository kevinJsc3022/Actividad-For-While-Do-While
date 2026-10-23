import java.util.Scanner;
public class FactorialNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = entrada.nextInt();
        int factorial = 1;
        for (int i=1; i<= numero; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
        entrada.close();
    }
}
