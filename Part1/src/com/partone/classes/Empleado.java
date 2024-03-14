package com.partone.classes;

public class Empleado {
    int codigo, horasTrabajadasMes;
    String nombre;
    double valorHora, porcentajeRetencion;

    public Empleado() {

    }

    public Empleado(int codigo, int horasTrabajadasMes, String nombre, double valorHora, double porcentajeRetencion) {
        this.codigo = codigo;
        this.horasTrabajadasMes = horasTrabajadasMes;
        this.nombre = nombre;
        this.valorHora = valorHora;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getHorasTrabajadasMes() {
        return horasTrabajadasMes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setHorasTrabajadasMes(int horasTrabajadasMes) {
        this.horasTrabajadasMes = horasTrabajadasMes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setPorcentajeRetencion(double porcentajeRetencion) {
        this.porcentajeRetencion = porcentajeRetencion;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getPorcentajeRetencion() {
        return porcentajeRetencion;
    }

    public double calcularSalarioBruto() {
        return horasTrabajadasMes * valorHora;
    }

    public double calcularSalarioNeto() {
        return calcularSalarioBruto() - calcularSalarioBruto() * (porcentajeRetencion / 100);
    }
}