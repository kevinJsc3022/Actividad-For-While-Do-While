import java.util.Scanner;
public class ContadorImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo: ");
        int numero = entrada.nextInt();
        int i = 1;
        System.out.println("Números impares:");
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= numero);
        entrada.close();
    }
}
