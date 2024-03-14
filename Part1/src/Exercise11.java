import com.partone.classes.Numero;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        double n1, n2, n3, numeroMayor;

        Numero numero1 = new Numero();
        Numero numero2 = new Numero();
        Numero numero3 = new Numero();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el numero 1: ");
        n1 = teclado.nextDouble();
        numero1.setNumero(n1);

        System.out.println("Ingrese el numero 2: ");
        n2 = teclado.nextDouble();
        numero2.setNumero(n2);

        System.out.println("Ingrese el numero 3: ");
        n3 = teclado.nextDouble();
        numero3.setNumero(n3);

        if (numero1.getNumero() > numero2.getNumero() && numero1.getNumero() > numero3.getNumero()) {
            numeroMayor = numero1.getNumero();
        } else {
            if (numero2.getNumero() > numero3.getNumero()) {
                numeroMayor = numero2.getNumero();
            } else {
                numeroMayor = numero3.getNumero();
            }
        }
        System.out.println("El numero mayor es: " + numeroMayor);
    }
}
