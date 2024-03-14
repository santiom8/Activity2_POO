package com.partone.classes;

public class TrianguloEquilatero {
    double lado;

    public TrianguloEquilatero() {
    }

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro() {
        return 3 * (lado);
    }

    public double calcularAltura() {
        double area, lado;
        lado = getLado();

        area = lado * (Math.sqrt(3) / 2);
        return area;
    }

    public double calcularArea() {
        double lado;
        lado = getLado();

        return Math.pow(lado, 2) / 2;
    }
}