/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SimulacroCorrecto;



/**
 *
 * @author Javier Ruiz Gomez
 */
// Interfaz con múltiples responsabilidades (violación del ISP)
public interface Dispositivo {

    void encender(); //Metodo para encender el Dispositivo

    void apagar(); //Metodo para apagar el Dispositivo

    boolean isEncendido(); //Metodo para comprobar el estado del dispositivo
}
