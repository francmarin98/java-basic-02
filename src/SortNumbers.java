import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = new Integer[2];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        if (numbers[0] > numbers[1]){
            System.out.println("Numbers: " + numbers[1] + "," + numbers[0]);
        }else{
            System.out.println("Numbers: " + numbers[0] + "," + numbers[1]);
        }

    }
}
