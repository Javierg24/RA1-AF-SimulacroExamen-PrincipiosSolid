/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package SimulacroCorrecto;

/**
 *
 * @author Javier Ruiz Gomez
 */
public class Aplicacion {
    public static void main(String[] args) {
        Logs oLogger = new Logs();
        Lampara oLampara = new Lampara(oLogger);
        Interruptor oInterruptor = new Interruptor(oLampara);
        oInterruptor.presionar(); 
        oInterruptor.presionar();        
    }
}
