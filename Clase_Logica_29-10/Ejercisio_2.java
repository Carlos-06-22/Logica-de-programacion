public class Ejercisio_2 {

    public static void main(String[] args) {

        Double[] Calificaciones = {3.5,4.0,2.8,5.0};
        Double SumaTotal = 0.0;
        Double Promedio = 0.0;

        for (int i = 0; i < Calificaciones.length; i++) {

            System.out.println("La calificacion del estudiante " + (i+1) + " es: " + Calificaciones[i]);
            SumaTotal += Calificaciones[i];
            
        }

        Promedio = SumaTotal / Calificaciones.length;
        System.out.println("El promedio de las calificaciones es: " + Promedio);

    }
    
}
