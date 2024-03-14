package com.partone.classes;

public class Almacen {
    public double purchaseValue;
    public String ballColor;

    public Almacen(double purchaseValue, String ballColor) {
        this.purchaseValue = purchaseValue;
        this.ballColor = ballColor;
    }

    public double computeTotal() {
        float discount;
        if (this.ballColor.equals("blanca")) {
            discount = 0.0f;
        } else if (this.ballColor.equals("verde")) {
            discount = 0.1f;
        } else if (this.ballColor.equals("amarilla")) {
            discount = 0.25f;
        } else if (this.ballColor.equals("azul")) {
            discount = 0.5f;
        } else if (this.ballColor.equals("roja")) {
            discount = 1f;
        } else {
            discount = 0.0f;
            System.out.println("Color incorrecto");
        }
        return this.purchaseValue * (1 - discount);
    }
}
