import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("suma = " + suma);
        System.out.println("(i + j) = " + (i + j));

        int resta = i -j;
        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j));

        int multip = i * j;
        System.out.println("multip = " + multip);
        System.out.println("(i * j) = " + (i * j));

        int div = i / j;
        System.out.println("div = " + div);

        float div2 = (float) i / (float) j;
        System.out.println("div2 = " + div2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        if (numero % 2 == 0) {
            System.out.println("numero es par");
        }else {
            System.out.println("numero es impar");
        }

    }
}
