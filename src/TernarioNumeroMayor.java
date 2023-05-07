import java.util.Scanner;

public class TernarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero 1: " );
        int numberOne = scanner.nextInt();

        System.out.println("Ingrese numero 2: ");
        int numberTwo = scanner.nextInt();

        max = numberOne > numberTwo ? numberOne : numberTwo;
        System.out.println("El numero mayor es el: "+ max);

    }
}
