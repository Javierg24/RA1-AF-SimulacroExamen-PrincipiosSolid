/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SimulacroCorrecto;


/**
 *
 * @author Javier Ruiz Gomez
 */
/**
 * Clase responsable de gestionar el registro de eventos o acciones en el sistema.
 * Permite guardar un mensaje de log que se muestra en la consola.
 */
public class Logs {

    /**
     * Guarda un mensaje en el log.
     *
     * @param mensaje el mensaje a registrar, que describe el evento o acción realizada
     */
    public void guardarLog(String mensaje) {
        System.out.println("Guardando log: " + mensaje); // Muestra el mensaje en la consola
    }
}
