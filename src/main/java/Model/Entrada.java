/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author johan
 */
public class Entrada extends Torniquete{
    private Atraccion atraccionAsociada;
    private Salida torniqueteSalida;
    
    public Entrada(String id){
        super(id);
    }
    
    public void setAtraccionAsociada(Atraccion atraccion){
        this.atraccionAsociada = atraccion;
    }
    
    public void setTorniqueteSalida(Salida salida){
        this.torniqueteSalida = salida;
    }
    
    public void ponerseVerde(){
        System.out.println("Torn-Entrada " + getIdTor() + " luz verde. pase por favor");
    }
    
    public void ponerseAmarillo(){
        System.out.println("Torn-Entrada " + getIdTor() + " luz amarilla. esperando reparacion");
    }
    
    public void ponerseRojo(){
        System.out.println("Torn-Entrada " + getIdTor() + " luz roja. atraccion llena");
    }
    
    public void intentarAbrirAcceso(){
        if(atraccionAsociada.tieneAveriasPendientes()){
            ponerseAmarillo();
        } else {
            resetearContador();
            ponerseVerde();
            
            torniqueteSalida.setPersonasEsperadas(atraccionAsociada.getNumMaxOcupantes());
        }
    }
}
