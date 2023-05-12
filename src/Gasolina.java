import java.util.Scanner;

public class Gasolina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cual es el valor actual de tanque de gasolina?");
        System.out.print("Ingrese por favor: ");

        Integer totalLts = scanner.nextInt();

        if (totalLts == 70){
            System.out.println("Tanque lleno");
        } else if (totalLts >= 60 && totalLts < 70) {
            System.out.println("Tanque casi lleno");
        } else if (totalLts >= 40 && totalLts < 60) {
            System.out.println("Tanque 3/4");
        } else if (totalLts >= 35 && totalLts < 40) {
            System.out.println("Medio tanque");
        } else if (totalLts >= 20 && totalLts < 35) {
            System.out.println("Suficiente");
        }else {
            System.out.println("Insuficiente");
        }


    }
}
