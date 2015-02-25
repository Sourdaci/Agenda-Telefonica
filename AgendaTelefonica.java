import java.util.HashMap;
import java.util.Set;
/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> agenda;
    // Clave de tipo String para el nombre
    // Valor de tipo String para el numero

    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        agenda = new HashMap<String, String>();
    }

    public void enterNumber(String nombre, String numero){
        agenda.put(nombre, numero);
    }
    
    public String lookupNumber(String nombre){
        String numero = agenda.get(nombre);
        if (numero == null){
            numero = "El nombre buscado no existe";
        }
        return numero;
    }
    
    /**
     * Print all keys
     */
    public void printAllNames(){
        Set nombres = agenda.keySet();
        System.out.print(nombres);
    }
}
