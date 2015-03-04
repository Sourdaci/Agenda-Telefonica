import java.util.HashMap;
import java.util.Set;
/**
 * Esta clase almacena nombres de personas y sus numeros de telefono
 * Nombres y numeros son objetos del tipo String
 * Cada pareja de nombre y numero es un registro almacenado en un HashMap
 * La clave del HashMap es el nombre de la persona
 * 
 * @author Sourdaci 
 * @version 2015-03-04 01
 */
public class AgendaTelefonica
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> agenda;
    // Clave de tipo String para el nombre
    // Valor de tipo String para el numero

    /**
     * Se crea una agenda de telefonos vacia
     */
    public AgendaTelefonica()
    {
        agenda = new HashMap<String, String>();
    }

    /**
     * Almacena el nombre y el numero de telefono de una persona
     * 
     * @param nombre El nombre de la persona
     * @param numero El numero de telefono de la persona
     */
    public void enterNumber(String nombre, String numero){
        agenda.put(nombre, numero);
    }
    
    /**
     * Busca y devuelve el numero de telefono de una persona en la agenda
     * 
     * @param nombre El nombre de la persona cuyo telefono buscamos
     * @return El numero de telefono si existe, o un mensaje indicando que no existe ese nombre
     */
    public String lookupNumber(String nombre){
        String numero = agenda.get(nombre);
        if (numero == null){
            numero = "El nombre buscado no existe";
        }
        return numero;
    }
    
    /**
     * Muestra por pantalla todas las personas y sus numeros de telefono
     */
    public void printAllNames(){
        Set nombres = agenda.keySet();
        System.out.print(nombres);
    }
}
