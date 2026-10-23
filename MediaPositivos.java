import java.util.Scanner;
public class MediaPositivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;
        do {
            System.out.print("Ingresa un número positivo: ");
            numero = entrada.nextInt();

            if (numero >= 0) {
                suma += numero;
                contador++;
            }
        } while (numero >= 0);
        double media = (double) suma / contador;
        System.out.println("La media de los números positivos es: " + media);
        entrada.close();
    }
}
