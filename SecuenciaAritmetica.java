import java.util.Scanner;
public class SecuenciaAritmetica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int numero = entrada.nextInt();
        System.out.print("Ingresa la diferencia: ");
        int diferencia = entrada.nextInt();
        System.out.print("Ingresa el número máximo: ");
        int maximo = entrada.nextInt();
        System.out.println("Secuencia aritmética:");
        do {
            System.out.println(numero);
            numero = numero + diferencia;
        } while (numero <= maximo);
        entrada.close();
    }
}
