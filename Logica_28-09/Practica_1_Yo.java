
import java.util.Scanner;

public class Practica_1_Yo {

    public static void main(String[] args) {

        int Edad;
        String Nombre;
        int EdadNecesaria = 18;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre");
        Nombre = sc.nextLine();

        System.out.println("Ingrese la edad");
        Edad = sc.nextInt();

        if (Edad >= EdadNecesaria) {
            System.out.println(Nombre + " puede entrar");
        } else {
            System.out.println(Nombre + " no puede entrar");
        }
        sc.close();
    }
}
