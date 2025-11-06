/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author johan
 */
public abstract class Atraccion {
   private int numeroAveriasPendientes;
   private String calle;
   private String nombre;
   private int numMaxOcupantes;
   
   private Entrada torniqueteEntrada;
   private Salida torniqueteSalida;
   
   public Atraccion(String nombre, String calle, int maxOcupantes){
       this.nombre = nombre;
       this.calle = calle;
       this.numMaxOcupantes = maxOcupantes;
       this.numeroAveriasPendientes = 0;
   }
   
   public void registrarAveriaPendiente(){
       this.numeroAveriasPendientes++;
       System.out.println("Atraccion "+ nombre + "Averia registrada. total pendientes "+ numeroAveriasPendientes);
   }
   
   public void anularAveriaPendiente(){
       if(this.numeroAveriasPendientes > 0){
           this.numeroAveriasPendientes--;
       }
       System.out.println("Atraccion "+ nombre +" Averia resuelta. total pendientes "+ numeroAveriasPendientes);
   }
   
   public boolean tieneAveriasPendientes(){
       return this.numeroAveriasPendientes > 0;
   }
   
   public void iniciarViaje(){
       System.out.println("Atraccion "+ nombre +" Iniciando viaje...");
       torniqueteEntrada.ponerseRojo();
   }
   
   public void detenerViaje(){
       System.out.println("Atraccion "+ nombre +" Viaje terminado...");
       torniqueteSalida.abrirse();
   }

    public String getCalle() {
        return calle;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumMaxOcupantes() {
        return numMaxOcupantes;
    }
   
   public void setTorniquete(Entrada e, Salida s){
       this.torniqueteEntrada = e;
       this.torniqueteSalida = s;
       
       e.setAtraccionAsociada(this);
   }
}
