import com.partone.classes.TrianguloEquilatero;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        double lado;
        TrianguloEquilatero triangulo = new TrianguloEquilatero();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el lado del triángulo equilatero: ");
        lado = teclado.nextDouble();
        triangulo.setLado(lado);

        System.out.println("El perimetro del triángulo es: " + triangulo.calcularPerimetro());
        System.out.println("La altura del triángulo es: " + triangulo.calcularAltura());
        System.out.println("El área del triángulo es: " + triangulo.calcularArea());

    }
}
