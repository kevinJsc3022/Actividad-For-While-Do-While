import java.util.Scanner;
public class ContadorDigitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = entrada.nextInt();
        int contador = 0;
        while (numero !=0) {
            numero = numero / 10;
            contador++;
        }
        System.out.println("El número tiene " + contador + " dígitos");
        entrada.close();
    }
}
