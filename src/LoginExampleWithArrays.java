import java.util.Scanner;

public class LoginExampleWithArrays {
    public static void main(String[] args) {

        String[] users = { "fmarin", "francmarin98"};
        String[] passwords = {"12345", "54321"};

        boolean isAuth = false;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el usuario: ");
        String user = sc.next();

        System.out.print("Ingrese la contraseña:" );
        String pass = sc.next();

        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(user) && passwords[i].equals(pass)) {
                isAuth = true;
                break;
            }
        }


        if (isAuth){
            System.out.println("Login exitoso");
        }else {
            System.out.println("Error, verifique las credenciales");
        }

    }
}

