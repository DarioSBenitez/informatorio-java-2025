package clases.imperativa;

public class OperadoresOperandos {
    public static void main(String[] args) {

        // Prefija
        int valorInicial = 5;
        int valorPrefija = ++valorInicial;
        System.out.println(valorPrefija);
        
        // Sufija
        valorInicial = 5;
        int valorSufija = valorInicial++;
        System.out.println(valorSufija);

        // Infija
        int suma = valorPrefija + valorSufija;
        int resta = 2 - 3;
        int multiplicacion = 2 * 3;
        int division = 10 / 5;

        System.out.println("Resultado de la suma es: " + suma);
        System.out.println("Resultado de la resta es: " + resta);
        System.out.println("Resultado de la multiplicacion es: " + division);
        System.out.println("Resultado de la division es: " + multiplicacion);

        // Operador ternario
        // Devuelven verdadero o falso
        // ( Evaluacion )? valorSiVerdadero : ValorSiFalso;  *** Este es el esquema del operador ternario ***

        // Otras evaluaciones posibles son:
        // > Mayor que
        // > Mayor o igual que
        // > Menor que
        // > Menor o igual que
        // == igual


        String resultadoOperadorTernario = ( suma > resta )? "Si es" : "No es"; // Este es el esquema de operador ternario que devuelve verdadero o falso. puede devolver cualquier cosa pero el tipo de dato que devuelve debe ser el mismo que el tipo de dato de la variable.
        int esMenor = ( suma < resta )? 1 : 0;   // si es menor devuelve 1 y si es mayor devuelve 0
        //  Para este operador ternario definimos el nombre de la variable como si fuese una pregunta
        System.out.println("El resultado es: " + resultadoOperadorTernario);

        final int ESTE_ES_UN_VALOR_CONSTANTE = 2;   // espacio en memoria, es valor constante, y por eso dice final al principio. Este valor en memoria no cambia más en todo el codigo

        System.out.println((suma > resta)? "si" : "no");    // Puedo en el print directamente poner la operación
    }
}
