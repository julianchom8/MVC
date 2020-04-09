
package co.edu.ucundinamarca.MVC.Modelo;

/**
 *
 * @author Julian Andres Medina Alba
 * @author Erika Tatiana Cortes Crispin
 * @version 1.0
 */
public class Mmodelo {
    /**
     * variable nombre que va a recibir el parametro de la caja e texto
     */
    private String nombre;
    /**
     * constructor de la clase modelo 
     * @param nombre 
     */
    public Mmodelo(String nombre) {
        this.nombre = nombre;
    }

    public Mmodelo() {
    }
    
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }


    
    
}
