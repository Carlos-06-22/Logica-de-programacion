import java.util.Scanner;

public class Practica_1_Divisas {
    
    public static void main(String[] args) throws Exception { 

        Scanner Leer = new Scanner(System.in);

        int Opcion;

       do {

            System.out.println("==== Conversor de Divisas ====");
            System.out.println("|  1. Convertir de COP a USD |");
            System.out.println("|  2. Convertir de COP a EUR |");
            System.out.println("|  3. Salir                  |");
            System.out.println("==============================");
            System.out.print("Seleccione una opción: ");
            Opcion = Leer.nextInt();
            
            switch (Opcion) {
                case 1:
                    System.out.print("Ingrese el valor en COP: ");
                    double ValorCOP = Leer.nextDouble();
                    double ValorUSD = conversionLower(ValorCOP);
                    System.out.println("El valor en USD es: " + ValorUSD);
                    break;
                case 2:
                    System.out.print("Ingrese el valor en COP: ");
                    double ValorCOP2 = Leer.nextDouble();
                    double ValorEUR = conversionUpper(ValorCOP2);
                    System.out.println("El valor en EUR es: " + ValorEUR);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }while(Opcion !=3);
            Leer.close();
        
    }

    public static double conversionLower(Double Valor) {

        return Valor / 3173.76;  

    }

    public static double conversionUpper(Double Valor) {

        return Valor / 3553.40;  
        
    }

}
