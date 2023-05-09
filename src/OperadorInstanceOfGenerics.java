public class OperadorInstanceOfGenerics {
    public static void main(String[] args) {
        Object texto = "Creando un objeto de la clase String";
        Number num = 7; // Integer.valueOf(7)

        boolean b1 = texto instanceof Object;
        boolean b2 = texto instanceof String;
        boolean b3 = num instanceof Integer;
        boolean b4 = num instanceof Long;
        boolean b5 = num instanceof Float;


        System.out.println("texto es el del tipo String = " + b1);
        System.out.println("texto es el del tipo Object = " + b2);
        System.out.println("num es el del tipo Integer = " + b3);
        System.out.println("num es el del tipo Number = " + b4);
        System.out.println("num es el del tipo Object = " + b5);


    }
}
