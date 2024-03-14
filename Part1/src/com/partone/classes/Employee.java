package com.partone.classes;

public class Employee {
    String name;
    double salaryPerHour;
    int hoursWorked;

    public Employee(String name, double salaryPerHour, int hoursWorked) {
        this.name = name;
        this.salaryPerHour = salaryPerHour;
        this.hoursWorked = hoursWorked;
    }

    public double computeMonthlySalary() {
        return salaryPerHour * hoursWorked;
    }

    public void showSalary() {
        double monthlySalary = computeMonthlySalary();
        if (monthlySalary > 450000) {
            System.out.println("Nombre: " + name);
            System.out.println("Salario Mensual: $" + monthlySalary);
        } else {
            System.out.println("Nombre: " + name);
        }
    }
}
