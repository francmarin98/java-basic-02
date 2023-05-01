public class OperadoresAsignacion {
    public static void main(String[] args) {
       int i = 69;
       int j = 24;

       i = i + 2;
       i += 2;

       j = j - 5;
       j -= 10;

       i = i *5;
       i *= 5;

       j = j / 3;
       j  /= j;

       String sqlString = "select * from clientes as c";
       sqlString += "where c.nombre ='Francisco'";


        System.out.println("sqlString = " + sqlString);
       System.out.println("j = " + j);
       System.out.println("i = " + i);
    }
}