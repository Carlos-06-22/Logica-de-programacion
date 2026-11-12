import java.util.Scanner;

public class Ejercisio_2_While {
    
    public static void main(String[] args) {
        
        int NumFacturas;
        float ValorFactura;
        float ValorTotal = 0;
        int NumDeFactura = 1;
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Por favor ingrese el numero de facturas");
        NumFacturas = Leer.nextInt();

        while (NumFacturas > 0) {
            
            System.out.println("Igrese el valor de la factura #" + NumDeFactura);
            ValorFactura = Leer.nextFloat();

            NumFacturas = NumFacturas - 1;
            ValorTotal = ValorTotal + ValorFactura;
            NumDeFactura++;

        }

        if (NumFacturas == 0) {
           System.out.println("El valor total de las facturas es: " + ValorTotal); 
        }

        Leer.close();

    }

}
