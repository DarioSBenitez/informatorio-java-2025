/* Tipos de conversiones:
 * PROMOCIÓN: Transforma un dato de un tipo a otro con el mismo o mayor espacio de memoria para almacenar un dato.
 * 
 * CONTRACCIÓN: Transforma un dato de un tipo a otro de menor espacio en memoria para almacenar dato con la
 * consecuente posible pérdida de información.
 * 
 * CONVERSIÓN IMPLÍCITA: Cuando se combinan dos operandos de distinto tipo, se convierte el de menor precisión al de mayor precisión
 */

package clases.imperativa;  // En que paquete esta?, o sea, en que carpeta?, está en: clases/imperativa, es decir... clases.imperativa

public class ConversionDatos {
    public static void main(String[] args) {
        //Promocion
        int value1 = 5;

        //Contraccion o tambien denominado cast o casteo
        int value2 = (int) 2.34f;   // Es ineficiente en el programa en cuanto al tiempo de ejecución

        // ********************************************************************************
        String cantidad = "15";
        String precio = "150.27";

        int cantEntero = Integer.parseInt(cantidad);    // clase wraper.metodo(String)
        double precioDouble = Double.parseDouble(precio);   // clase wraper.metodo(Double)

        System.out.println("El precio total es: " + cantEntero * precioDouble);
        // ********************************************************************************

        // ********************************************************************************
        // Para el caso contrario...  quiero pasar los enteros a string
        int edad = 30;
        double estatura = 1.67;

        String edadString = String.valueOf(edad);   // clase wraper.metodo(string)
        String estaturaString = String.valueOf(estatura);

        System.out.println("Edad: " + edadString + " Estatura: " + estaturaString);
        // ********************************************************************************



        //Implicita
        double value3 = 10 + 20.5d;
    }
}
