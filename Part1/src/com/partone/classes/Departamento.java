package com.partone.classes;

public class Departamento {
    public double sales;
    public double salesPersonSalary;

    public Departamento(double sales, double salesPersonSalary) {
        this.sales = sales;
        this.salesPersonSalary = salesPersonSalary;
    }

    public double calculateIncentive(double totalSales) {
        if (sales > 0.33 * totalSales) {
            return salesPersonSalary * 0.2;
        } else {
            return 0;
        }
    }
}
