import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {


        String variable = 7 == 7 ? "si es verdadero" : "es falso";
        System.out.println("variable = " + variable);

        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[3];
        double promedio = 0;
        String estado;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            notas[i] = scanner.nextDouble();
        }

        for (double nota : notas) {
            promedio += nota / notas.length;
        }

        estado = promedio > 7 ? "Aprobado" : "Suspenso";
        System.out.println("promedio = " + promedio);
        System.out.println("estado = " + estado);




    }
}
