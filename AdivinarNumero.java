import java.util.Scanner;
public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroSecreto = (int)(Math.random() * 100) + 1;
        int intento = 0;
        while (intento != numeroSecreto) {
            System.out.print("Adivina el número (1-100): ");
            intento = entrada.nextInt();
            if (intento > numeroSecreto) {
                System.out.println("Demasiado alto");
            } else if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo");
            } else {
                System.out.println("¡Correcto! Adivinaste el número.");
            }
        }
        entrada.close();
    }
}
