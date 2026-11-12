Algoritmo para caulcular el rendimiento de combustible y costo por kilometro en una empresade transportes.Para un carro especifico con el tanque lleno.

//Entrada

Inicio Calculo_Combustible
    Definir KilometrosRecorridos Como Decimal;
    Definir Const TAMANODEPOSITO=12 Como Decimal;
    Definir Const PRECIO=16800.80 Como Decimal;
    Definir RendimientoCombustibleKilometro Como Decimal;
    Definir CostoCombustibleKilometro Como Decimal;

    //Proceso

    Escribir"Ingrese los kilometros recorridos";
    Leer KilometrosRecorridos;

    RendimientoCombustibleKilometro = TAMANODEPOSITO / KilometrosRecorridos;

    CostoCombustibleKilometro = PRECIOCombustible * RendimientoCombustibleKilometro;

    //Salida

    Escribir "El rendimiento del Combustible por kilometro es: " + RendimientoCombustibleKilometro + "G/k Galones por kilometro";

    Escribir "El costo del Combustible por kilometro es: " + RendimientoCombustibleKilometro + "G/k Galones por kilometro";




