
package co.edu.ucundinamarca.MVC.Controlador;

import co.edu.ucundinamarca.MVC.Modelo.Mmodelo;
import co.edu.ucundinamarca.MVC.Vista.MVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Julian Andres Medina Alba
 * @author Erika Tatiana Cortes Crispin
 * @version 1.0
 */
public class MControlador implements ActionListener {
    /**
     * Objeto del paquete Vista de la clace MVista
     */
    private MVista vista;
    /**
     * Objeto del paquete Modelo de la clase Mmodelo
     */
    private Mmodelo modelo;
    /**
     * constructor de la clase MControlador inicializa los paramteros
     * @param vista
     * @param modelo 
     */
    public MControlador(MVista vista, Mmodelo modelo) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.jBIngresar.addActionListener(this);
    
    }
    /**
     * metodo implementado de la interfaz ActionListener que da funcion al boton 
     * de la vista
     * @param e 
     */

    @Override
    public void actionPerformed(ActionEvent e) {
   
     modelo.setNombre(vista.jTnombre.getText());
     vista.area.setText(vista.area.getText()+modelo.getNombre()+"\n");
    }

}
