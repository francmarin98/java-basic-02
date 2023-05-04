public class OperadoresLogicos {
    public static void main(String[] args) {
        int i = 6;
        byte j = 9;
        float k = 1.27e2f;
        double l = 34.44;
        boolean m = false;

        boolean b1 = i == j && 3 <= 9;
        System.out.println("b1 = " + b1);


        boolean b2 = k > l || !m;
        System.out.println("b2 = " + b2);

        boolean b3 = (i == j && k > j) || m;
        System.out.println("b3 = " + b3);

        boolean b4 = i > j || j < k && l > 8;
        System.out.println("b4 = " + b4);

        // EN JAVA El OR tiene menos precedencia que él AND
        boolean b5 = true || false && false;
        System.out.println("b5 = " + b5);

        boolean b6 = (true || false) && false;
        System.out.println("b6 = " + b6);

        boolean b7 = ((true || false) && false) || true;
        System.out.println("b7 = " + b7);

    }
}
