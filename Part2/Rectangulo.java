/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasGeometricas;

public class Rectangulo {
    int base, altura;
    
    public Rectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
    }
    
    double calcularArea(){
        return base*altura;
    }
    
    double calcularPerimetro(){
        return (2*base)+(2*altura);
    }
}
