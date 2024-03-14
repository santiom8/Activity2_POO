import com.partone.classes.Departamento;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Ingrese ventas del departamento 1:");
        double salesDep1 = data.nextDouble();
        System.out.println("Ingrese ventas del departamento 2:");
        double salesDep2 = data.nextDouble();
        System.out.println("Ingrese ventas del departamento 3:");
        double salesDep3 = data.nextDouble();

        System.out.println("Ingrese salario de los vendedores:");
        double salesPersonSalary = data.nextDouble();

        double totalSales = salesDep1 + salesDep2 + salesDep3;

        Departamento depto1 = new Departamento(salesDep1, salesPersonSalary);
        Departamento depto2 = new Departamento(salesDep2, salesPersonSalary);
        Departamento depto3 = new Departamento(salesDep3, salesPersonSalary);

        double incentiveDepto1 = depto1.calculateIncentive(totalSales);
        double incentiveDepto2 = depto2.calculateIncentive(totalSales);
        double incentiveDepto3 = depto3.calculateIncentive(totalSales);

        System.out.println("Salario de los vendedores en el departamento 1: " + (salesPersonSalary + incentiveDepto1));
        System.out.println("Salario de los vendedores en el departamento 2: " + (salesPersonSalary + incentiveDepto2));
        System.out.println("Salario de los vendedores en el departamento 3: " + (salesPersonSalary + incentiveDepto3));
    }
}
