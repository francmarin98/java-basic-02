public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Pre incremento
        int i = 7;
        int j = ++i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post Incremento
        i = 6;
        System.out.println("Valor inicial de i = " + i);
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);


        // Pre decremento
        i = 3;
        System.out.println("i = " + i);
        j = --i;
        System.out.println("j = " + j);


        // Post decremento
        i = 8;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

    }
}
