import com.partone.classes.PagoMatricula;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        int numeroInscripcion, estratoSocial;
        String nombres;
        double patrimonio;

        PagoMatricula pagoMatricula = new PagoMatricula();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el número de inscripción: ");
        numeroInscripcion = teclado.nextInt();
        pagoMatricula.setNumeroInscripcion(numeroInscripcion);
        teclado.nextLine();

        System.out.println("Ingrese su nombre completo: ");
        nombres = teclado.nextLine();
        pagoMatricula.setNombres(nombres);

        System.out.println("Ingrese su patrimonio: ");
        patrimonio = teclado.nextDouble();
        pagoMatricula.setPatrimonio(patrimonio);

        System.out.println("Ingrese su estrato social:");
        estratoSocial = teclado.nextInt();
        pagoMatricula.setEstratoSocial(estratoSocial);

        System.out.println("Número de inscripción: " + pagoMatricula.getNumeroInscripcion());
        System.out.println("Nombres: " + pagoMatricula.getNombres());
        System.out.println("Pago de matrícula: " + pagoMatricula.calcularPagoMatricula());
    }
}
