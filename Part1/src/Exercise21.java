import com.partone.classes.Triangulo;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {

        double lado1, lado2, lado3;
        Triangulo triangulo = new Triangulo();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el lado 1 del triángulo: ");
        lado1 = teclado.nextDouble();
        triangulo.setLado1(lado1);

        System.out.println("Ingrese el lado 2 del triángulo: ");
        lado2 = teclado.nextDouble();
        triangulo.setLado2(lado2);

        System.out.println("Ingrese el lado 3 del triángulo: ");
        lado3 = teclado.nextDouble();
        triangulo.setLado3(lado3);

        System.out.println("El perímetro del triángulo es: " + triangulo.calcularPerimetro());
        System.out.println("El semiperímetro del triángulo es: " + triangulo.calcularSemiPerimetro());
        System.out.println("El área del triángulo es: " + triangulo.calcularArea());
    }
}
