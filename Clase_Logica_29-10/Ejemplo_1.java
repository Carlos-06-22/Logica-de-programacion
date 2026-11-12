import java.util.Scanner;
public class Ejemplo_1 {
    
    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in);
    
        int Numero;
        Numero = Leer.nextInt();
        System.out.println("El cuadrado del numero es: " + CalcularCuadrado(Numero, Numero));
        Leer.close();
    }

    public static int CalcularCuadrado(int Entrada, int EntradaB) {
        return Entrada * EntradaB;
    }

}
