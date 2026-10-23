import java.util.Scanner;
public class SecuenciaCuadrados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo: ");
        int numero = entrada.nextInt();
        int i = 1;
        System.out.println("Cuadrados de los números:");
        do {
            System.out.println(i + "² = " + (i * i));
            i++;
        } while (i <= numero);
        entrada.close();
    }
}
