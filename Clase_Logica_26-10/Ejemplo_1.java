import java.util.Scanner;

public class Ejemplo_1 {
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws Exception { 

        Scanner Leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre a convertir: ");
        conversionLower(Leer.nextLine());
        conversionUpper(Leer.nextLine());

        Leer.close();

    }

    public static void conversionLower(String Nombre) {

        System.out.println(Nombre.toLowerCase());

    }

    public static void conversionUpper(String Nombre) {

        System.out.println(Nombre.toUpperCase());
        
    }



}
