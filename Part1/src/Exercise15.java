import com.partone.classes.PesoEsferas;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A: ");
        double weigthA = keyboard.nextDouble();
        System.out.println("Ingrese el peso de la esfera B: ");
        double weigthB = keyboard.nextDouble();
        System.out.println("Ingrese el peso de la esfera C: ");
        double weigthC = keyboard.nextDouble();
        System.out.println("Ingrese el peso de la esfera D: ");
        double weigthD = keyboard.nextDouble();

        PesoEsferas esferas = new PesoEsferas(weigthA, weigthB, weigthC, weigthD);
        esferas.determineDifferentSphere();
    }
}
