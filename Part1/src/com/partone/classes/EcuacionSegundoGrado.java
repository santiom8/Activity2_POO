package com.partone.classes;

public class EcuacionSegundoGrado {
    double a, b, c;

    public EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void findSolutions() {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("La única solución es: x = " + x);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Las soluciones son: ");
            System.out.println("x1 = "  + realPart + " + " + imaginaryPart + "i");
            System.out.println("x2 = "  + realPart + " - " + imaginaryPart + "i");
        }
    }
}

