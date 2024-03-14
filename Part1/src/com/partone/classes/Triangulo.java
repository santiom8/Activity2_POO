package com.partone.classes;

public class Triangulo {
    double lado1, lado2, lado3;

    public Triangulo() {
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public double calcularSemiPerimetro() {
        return calcularPerimetro() / 2f;
    }

    public double calcularArea() {
        double sp = calcularSemiPerimetro();
        return Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3));
    }
}

