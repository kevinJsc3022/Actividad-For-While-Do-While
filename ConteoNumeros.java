import java.util.Scanner;
public class ConteoNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cuántos números deseas ingresar? ");
        int cantidad = entrada.nextInt();
        int mayores = 0;
        int menores = 0;
        int iguales = 0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa un número: ");
            int numero = entrada.nextInt();
            if (numero > 0) {
                mayores++;
            } else if (numero < 0) {
                menores++;
            } else {
                iguales++;
            }
        }
        System.out.println("Números mayores que 0: " + mayores);
        System.out.println("Números menores que 0: " + menores);
        System.out.println("Números iguales a 0: " + iguales);
        entrada.close();
    }
}
