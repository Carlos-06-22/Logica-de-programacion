import java.util.Scanner;

public class Ejercisio_1_Sin_Condicional {

    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in);

        int Pasword = 1234;
        int PaswordUser;
        boolean Validacion = true;
        String UserName; 

        System.out.println("Porfavor ingrese el usuario");
        UserName = Leer.nextLine();

        System.out.println(UserName + " por favor ingresa la contraseña");
        PaswordUser = Leer.nextInt();

        Validacion = (Pasword ==PaswordUser);

        System.out.println(Validacion);
        
        Leer.close();

    }
}