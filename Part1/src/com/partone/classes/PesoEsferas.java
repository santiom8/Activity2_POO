package com.partone.classes;

public class PesoEsferas {
    public double pesoA;
    public double pesoB;
    public double pesoC;
    public double pesoD;

    public PesoEsferas(double pesoA, double pesoB, double pesoC, double pesoD) {
        this.pesoA = pesoA;
        this.pesoB = pesoB;
        this.pesoC = pesoC;
        this.pesoD = pesoD;
    }

    public void determineDifferentSphere() {
        if (pesoA == pesoB && pesoA == pesoC) {
            System.out.println("La esfera D es la diferente.");
            if (pesoD > pesoA) {
                System.out.println("La esfera D es de mayor peso.");
            } else {
                System.out.println("La esfera D es de menor peso.");
            }
        } else if (pesoA == pesoB && pesoA == pesoD) {
            System.out.println("La esfera C es la diferente.");
            if (pesoC > pesoA) {
                System.out.println("La esfera C es de mayor peso.");
            } else {
                System.out.println("La esfera C es de menor peso.");
            }
        } else if (pesoA == pesoC && pesoA == pesoD) {
            System.out.println("La esfera B es la diferente.");
            if (pesoB > pesoD) {
                System.out.println("La esfera B es de mayor peso.");
            } else {
                System.out.println("La esfera B es de menor peso.");
            }
        } else {
            System.out.println("La esfera A es la diferente.");
            if (pesoA > pesoB) {
                System.out.println("La esfera A es de mayor peso.");
            } else {
                System.out.println("La esfera A es de menor peso.");
            }
        }
    }
}
