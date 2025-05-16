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
        int value2 = (int) 2.34f;

        //Implicita
        double value3 = 10 + 20.5d;
    }
}
