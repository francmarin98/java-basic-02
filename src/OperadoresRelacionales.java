public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 6;
        byte j = 9;
        float k = 1.27e2f;
        double l = 34.44;
        boolean m = false;

        boolean b1 = i == j;
        System.out.println("b1 = " + b1);

        boolean b2 = !b1;
        System.out.println("b2 = " + b2);

        boolean b3 = i != j;
        System.out.println("b3 = " + b3);

        boolean b4 = m == b2;
        System.out.println("b4 = " + b4);

        boolean b5 = i > j;
        System.out.println("b5 = " + b5);

        boolean b6 = j < i;
        System.out.println("b6 = " + b6);

        boolean b7 = l >= k;
        System.out.println("b7 = " + b7);

        boolean b8 = k <= l;
        System.out.println("b8 = " + b8);
    }
}
