import com.partone.classes.Numero;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        double n1, n2;
        Numero numero1 = new Numero();
        Numero numero2 = new Numero();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el número A :");
        n1 = teclado.nextDouble();
        numero1.setNumero(n1);

        System.out.println("Ingrese el número B");
        n2 = teclado.nextDouble();
        numero2.setNumero(n2);

        if (numero1.getNumero() > numero2.getNumero()) {
            System.out.println("El número A = " + numero1.getNumero() + " es mayor al número B= " + numero2.getNumero());
        } else if (numero1.getNumero() == numero2.getNumero()) {
            System.out.println("El número  A =" + numero1.getNumero() + " es igual al número B= " + numero2.getNumero());
        } else {
            System.out.println("El número A = " + numero1.getNumero() + " es menor al número B= " + numero2.getNumero());
        }
    }
}
