import java.util.Scanner;
public class VocalesConsonantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char letra;
        while (true) {
            System.out.print("Ingresa una letra (espacio para salir): ");
            letra = entrada.nextLine().charAt(0);
            if (letra == ' ') {
                break;
            }
            if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' || letra == 'I' ||
                letra == 'o' || letra == 'O' || letra == 'u' || letra == 'U') {
                System.out.println("Es una vocal");
            } else {
                System.out.println("Es una consonante");
            }
        }
        System.out.println("Programa terminado.");
        entrada.close();
    }
}
