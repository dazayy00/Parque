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
public class Dispositivo_Operario {
    public enum Estado { LIBRE, OCUPADO};
    private String CedulaOperario;
    private String nombreOperario;
    private Estado estado;
    
    private ServicioMantenimiento cra;
    private ComponenteAveriable tareaAsignada;

    public Dispositivo_Operario(String cedula, String nombre, ServicioMantenimiento cra) {
        this.CedulaOperario = cedula;
        this.nombreOperario = nombre;
        this.cra = cra;
        this.estado = Estado.LIBRE;
    }
    
    public void indicarOcupado(ComponenteAveriable tarea){
        this.estado = Estado.OCUPADO;
        this.tareaAsignada = tarea;
        System.out.println("Operario "+ nombreOperario +" ocupado");
    }
    
    public void indicarFinRevision(){
        System.out.println("Operario "+ nombreOperario + " Tarea Finalizada");
        this.estado = Estado.LIBRE;
        
        if(cra != null){
            cra.reportarFinTarea(this);
        }
        if(tareaAsignada != null){
            tareaAsignada.notificarFinRevision();
        }
        this.tareaAsignada = null;
    }
    
    public boolean isLibre(){
        return this.estado == Estado.LIBRE;
    }
    
    public String getNombreOperario(){
        return nombreOperario;
    }
}
