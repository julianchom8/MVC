
package co.edu.ucundinamarca.MVC;

import co.edu.ucundinamarca.MVC.Controlador.MControlador;
import co.edu.ucundinamarca.MVC.Modelo.Mmodelo;
import co.edu.ucundinamarca.MVC.Vista.MVista;
/**
 *
 * @author Julian Andres Medina Alba
 * @author Erika Tatiana Cortes Crispin
 * @version 1.0
 */
public class Main {
    /**
     * motodo main que inicializa el programa
     * @param args 
     */
    public static void main(String[] args) {
        MVista vista = new MVista();
        Mmodelo model = new Mmodelo();
    
    MControlador control = new MControlador(vista,model);
     
        vista.setVisible(true);
    }
}
