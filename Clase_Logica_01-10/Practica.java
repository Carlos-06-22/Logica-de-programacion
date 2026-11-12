public class Practica {
    public static void main(String[] args) {
        
        boolean tienePermiso = true;
        int nivelAcceso = 5;

        //La siguiente linea tiene un error
        //System.out.println((nivelAcceso = 5) && (tienePermiso == true));

        //La siguiente linea es correcta
        System.out.println((nivelAcceso == 5) && (tienePermiso == true));

    }
}

//Hacer el ejercisio 2 del momento 1