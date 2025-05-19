package clases.imperativa;

public class OrganizacionDeCodigo {

    static int valorEntero3;

    public static void main(String[] args){
        // Bloque de codigo
        // Tipo nombreVariable; asi declaramos una variable
        // Para hacer una declaracion y asignacion en una sola linea hacemos
        int valorEntero2 = 2; // Declaracion y asignacion
        int valorEntero5 = 10; // Declaracion de varias variables

        System.out.println(valorEntero2);

        System.out.println(valorEntero5);
        System.out.println(valorEntero3);

        char letra = 'a';
        float numeroFlotante = 2.1f;        // aquí le decimos a java que este valor lo quiero float
        double numeroDouble = 2.1;          // porque el double es el número favoríto de java para float
        boolean valorBooleano = true;
        long valor = 2;

        System.out.println(numeroFlotante + " concatenacion " + letra + " " + numeroDouble + " " + valorBooleano);

        Long valorLong;
        Boolean valorBoolean;
        Character valorChar;
        Float valorWraper;
        
        String cadenaDeCaracter = "Hola soy una cadena";
        cadenaDeCaracter = cadenaDeCaracter + " " + "Otra cadena";
        System.out.println(cadenaDeCaracter);

    }
}