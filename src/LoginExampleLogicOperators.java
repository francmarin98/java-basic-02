import java.util.Scanner;

public class LoginExampleLogicOperators {
    public static void main(String[] args) {
        String username = "fmarin";
        String password = "Hello1234.";
        boolean isAuth = false;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el usuario: ");
        String user = sc.next();

        System.out.print("Ingrese la contraseña:" );
        String pass = sc.next();

        if(username.equals(user) && password.equals(pass)){
            isAuth = true;
        }

        if (isAuth){
            System.out.println("Login exitoso");
        }else {
            System.out.println("Error, verifique las credenciales");
        }

    }
}

