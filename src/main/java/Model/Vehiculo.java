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
public class Vehiculo extends ComponenteAveriable{

    public Vehiculo(String numero, ServicioMantenimiento cra) {
        super("Vehiculo " + numero, cra);
    }
    
}