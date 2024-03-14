/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasGeometricas;

public class FigurasGeometricas {
    public static void main(String[] args){
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2= new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
    
        System.out.println("El área del circulo es :" + figura1.calcularArea());
        System.out.println("El perimetro del circulo es :" + figura1.calcularPerimetro());
        
        System.out.println("El área del rectangulo es : "+ figura2.calcularArea());
        System.out.println("El perimetro del rectangulo es : "+ figura2.calcularPerimetro());
        
        System.out.println("El área del cuadrado es :" + figura3.calcularArea());
        System.out.println("El perimetro del cuadrado es :" + figura3.calcularPerimetro());
        
        System.out.println("El área del triangulo es : "+ figura4.calcularArea());
        System.out.println("El perimetro del triangulo es : " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
    }

    
}
