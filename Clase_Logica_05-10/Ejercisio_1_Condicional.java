import java.util.Scanner;

public class Ejercisio_1_Condicional {
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        int Pasword = 1234;
        int PaswordUser;
        String UserName; 

        System.out.println("Porfavor ingrese el usuario");
        UserName = Leer.nextLine();

        System.out.println(UserName + " por favor ingresa la contraseña");
        PaswordUser = Leer.nextInt();

        if (PaswordUser == Pasword){

            System.out.println("Bienvenido a su cuenta bancaria");
            
        }
        else{
            System.out.println("PIN incorrecto el sistema se cerrara por seguridad");
        }

        Leer.close();

    }
}
