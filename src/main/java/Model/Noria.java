/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;

/**
 *
 * @author johan
 */
public class Noria extends Atraccion{
    private List<Vehiculo> vehiculos;

    public Noria(String nombre, String calle, int maxOcupantes, List<Vehiculo> vehiculos) {
        super(nombre, calle, maxOcupantes);
        this.vehiculos = vehiculos;
        
        for(Vehiculo v : vehiculos){
            v.setAtraccion(this);
        }
    }
}
