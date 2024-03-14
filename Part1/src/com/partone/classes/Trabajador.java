package com.partone.classes;

public class Trabajador {
    public String name;
    public int hoursWorked;
    public double pricePerHour;

    public Trabajador(String name, int hoursWorked, double pricePerHour) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.pricePerHour = pricePerHour;
    }

    public double computeSalary() {
        double salary;
        int normallyHours = Math.min(this.hoursWorked, 40);
        int extraHours = Math.max(this.hoursWorked - 40, 0);

        if (extraHours > 8) {
            int overtime = extraHours - 8;
            salary = this.pricePerHour * normallyHours + this.pricePerHour * 2 * 8 + this.pricePerHour * 3 * overtime;
        } else {
            if (normallyHours < 40) {
                salary = this.pricePerHour * normallyHours;
            } else {
                salary = this.pricePerHour * normallyHours + this.pricePerHour * 2 * extraHours;
            }
        }
        return salary;
    }
}
