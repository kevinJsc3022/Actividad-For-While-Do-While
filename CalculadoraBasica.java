import java.util.Scanner;
public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;
        do {
            System.out.println("----- CALCULADORA -----");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = entrada.nextInt();
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer número: ");
                num1 = entrada.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                num2 = entrada.nextDouble();
                if (opcion == 1) {
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                } else if (opcion == 2) {
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                } else if (opcion == 3) {
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
            }
        } while (opcion != 5);
        System.out.println("Programa terminado.");
        entrada.close();
    }
}
