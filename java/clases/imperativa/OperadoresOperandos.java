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
        // ( Evaluacion )? valorSiVerdadero : ValorSiFalso;

        // Otras evaluaciones posibles son:
        // > Mayor que
        // > Mayor o igual que
        // > Menor que
        // > Menor o igual que
        // == igual


        string resultadoOperadorTernario = ( suma > resta )? "Si es" : "No es";
    }
}
