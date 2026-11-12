import java.util.Scanner;

public class Ejercisio_2_For {
    
    public static void main(String[] args) {
        
        int NumFacturas;
        float ValorFactura;
        float ValorTotal = 0;
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Por favor ingrese el numero de facturas");
        NumFacturas = Leer.nextInt();

        for (int i = 1; i <= NumFacturas; i++) {

            System.out.println("Ingrese el valor de la factura #" + i);
            ValorFactura = Leer.nextFloat();

            ValorTotal = ValorTotal + ValorFactura;
        }

        
        System.out.println("El valor total de las facturas es: " + ValorTotal); 
        
        Leer.close();


    }


}
