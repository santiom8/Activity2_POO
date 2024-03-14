import com.partone.classes.Employee;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado: ");
        String name = scanner.nextLine();

        System.out.println("Ingrese el salario por hora: ");
        double salaryPerHour = scanner.nextDouble();

        System.out.println("Ingrese el número de horas trabajadas en el mes: ");
        int hoursWorked = scanner.nextInt();

        Employee empleado = new Employee(name, salaryPerHour, hoursWorked);
        empleado.showSalary();
        scanner.close();
    }
}
