/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Logic.ServicioMantenimiento;

/**
 *
 * @author johan
 */
public class Vagon extends ComponenteAveriable{

    public Vagon(String numero, ServicioMantenimiento cra) {
        super("Vagon " + numero, cra);
    }
    
}
