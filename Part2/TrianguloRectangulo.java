/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasGeometricas;

public class TrianguloRectangulo {
    int base, altura;
    
    public TrianguloRectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
    }
    
    double calcularArea(){
        return ((base*altura)/2f);
    }
    
    double calcularHipotenusa(){
        return Math.sqrt(base*base +altura*altura);
    }
    
    double calcularPerimetro(){
        return base + altura + calcularHipotenusa();
    }
    
    void determinarTipoTriangulo(){
        if(base == altura && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
            System.out.println("Es un triángulo equilatero");
        }
        else if((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){
            System.out.println("Es un triángulo escaleno");
        }
        else {
            System.out.println("Es un triángulo isóceles");
        }
    }
}
