import com.partone.classes.EcuacionSegundoGrado;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de A: ");
        double a = scanner.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        double b = scanner.nextDouble();
        System.out.println("Ingrese el valor de C: ");
        double c = scanner.nextDouble();

        EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(a, b, c);
        ecuacion.findSolutions();

        scanner.close();
    }
}
