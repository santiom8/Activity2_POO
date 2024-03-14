import com.partone.classes.Esfera;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner sphere = new Scanner(System.in);

        System.out.println("Ingrese el peso de la esfera A:");
        double weigthA = sphere.nextDouble();
        System.out.println("Ingrese el peso de la esfera B:");
        double weigthB = sphere.nextDouble();
        System.out.println("Ingrese el peso de la esfera C:");
        double weigthC = sphere.nextDouble();

        Esfera esferaA = new Esfera("A", weigthA);
        Esfera esferaB = new Esfera("B", weigthB);
        Esfera esferaC = new Esfera("C", weigthC);


        if (esferaA.weigth >= esferaB.weigth && esferaA.weigth >= esferaC.weigth) {
            System.out.println("La esfera más pesada es: " + esferaA.name + " con un peso de " + esferaA.weigth);
        }
        if (esferaB.weigth >= esferaA.weigth && esferaB.weigth >= esferaC.weigth) {
            System.out.println("La esfera más pesada es: " + esferaB.name + " con un peso de " + esferaB.weigth);
        }
        if (esferaC.weigth >= esferaA.weigth && esferaC.weigth >= esferaB.weigth) {
            System.out.println("La esfera más pesada es: " + esferaC.name + " con un peso de " + esferaC.weigth);
        }
    }
}
