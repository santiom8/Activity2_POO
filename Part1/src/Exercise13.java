import com.partone.classes.Almacen;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        Scanner color = new Scanner(System.in);

        System.out.println("Ingrese el valor de la compra: ");
        double purchaseValue = value.nextDouble();

        System.out.println("Ingrese el color de la bolita (blanca, verde, amarilla, azul, roja): ");
        String ballColor = color.nextLine();

        Almacen almacen = new Almacen(purchaseValue, ballColor);
        double total = almacen.computeTotal();

        System.out.println("El cliente deberá pagar: $" + total);
    }
}
