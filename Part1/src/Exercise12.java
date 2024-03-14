import com.partone.classes.Trabajador;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Ingrese el nombre del trabajador:");
        String name = data.nextLine();

        System.out.println("Ingrese el número de horas trabajadas:");
        int hoursWorked = data.nextInt();

        System.out.println("Ingrese el valor de la hora normal de trabajo:");
        double pricePerHour = data.nextDouble();

        Trabajador trabajador = new Trabajador(name, hoursWorked, pricePerHour);
        double salary = trabajador.computeSalary();

        System.out.println("El trabajador " + trabajador.name + " devengó: $" + salary);
    }
}
