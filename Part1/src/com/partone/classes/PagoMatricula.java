package com.partone.classes;

public class PagoMatricula {
    int numeroInscripcion, estratoSocial;
    String nombres;
    double patrimonio;

    public PagoMatricula() {

    }

    public PagoMatricula(int numeroInscripcion, int estratoSocial, String nombres, double patrimonio) {
        this.numeroInscripcion = numeroInscripcion;
        this.estratoSocial = estratoSocial;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
    }

    public int getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public void setNumeroInscripcion(int numeroInscripcion) {
        this.numeroInscripcion = numeroInscripcion;
    }

    public int getEstratoSocial() {
        return estratoSocial;
    }

    public void setEstratoSocial(int estratoSocial) {
        this.estratoSocial = estratoSocial;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public double getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
    }

    public double calcularPagoMatricula() {
        double total;
        if (patrimonio > 2000000 && estratoSocial > 3) {
            total = 50000 + patrimonio * 0.03;
        } else {
            total = 50000;
        }
        return total;
    }
}
