/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasGeometricas;

public class Circulo {
    int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }
    double calcularArea(){
        return Math.PI*Math.pow(radio, 2);
    }
    
    double calcularPerimetro(){
        return 2*Math.PI*radio;
    }
}
