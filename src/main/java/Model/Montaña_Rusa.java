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
public class Montaña_Rusa extends Atraccion{
    private List<Vagon> vagones;

    public Montaña_Rusa(String nombre, String calle, int maxOcupantes, List<Vagon> vagones) {
        super(nombre, calle, maxOcupantes);
        this.vagones = vagones;
        
        for (Vagon v : vagones){
            v.setAtraccion(this);
        }
    }
}
