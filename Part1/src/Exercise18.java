import com.partone.classes.Empleado;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        int codigo, horasTrabajadas;
        String nombre;
        double valorHora, porcentajeRetencion, salarioBruto, salarioNeto;

        Empleado empleado = new Empleado();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el código del empleado: ");
        codigo = teclado.nextInt();
        empleado.setCodigo(codigo);
        teclado.nextLine();

        System.out.println("Ingrese el nombre del empleado: ");
        nombre = teclado.nextLine();
        empleado.setNombre(nombre);

        System.out.println("Ingrese las horas trabajadas: ");
        horasTrabajadas = teclado.nextInt();
        empleado.setHorasTrabajadasMes(horasTrabajadas);

        System.out.println("Ingrese el valor por hora: ");
        valorHora = teclado.nextDouble();
        empleado.setValorHora(valorHora);

        System.out.println("Ingrese el porcentaje de retención sin ( % ): ");
        porcentajeRetencion = teclado.nextDouble();
        empleado.setPorcentajeRetencion(porcentajeRetencion);

        System.out.println("Codigo empleado: " + empleado.getCodigo());
        System.out.println("Nombre empleado: " + empleado.getNombre());
        System.out.println("Salario bruto: " + empleado.calcularSalarioBruto());
        System.out.println("Salario neto: " + empleado.calcularSalarioNeto());
    }
}
