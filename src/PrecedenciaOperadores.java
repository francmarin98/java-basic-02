public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = i + j + (double) k / 3;
        System.out.println("promedio = " + promedio);

        double promedio2 = (double) (i + j + k) / 3;
        System.out.println("promedio2 = " + promedio2);

        promedio = (i + j +  k) / 3d * 10;
        System.out.println("promedio = " + promedio);

        promedio2 = --i + j++ - k / 3d * 5;
        System.out.println("promedio2 = " + promedio2);

    }
}
