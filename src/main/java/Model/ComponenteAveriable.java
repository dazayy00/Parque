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
public abstract class ComponenteAveriable {
    protected String numeroIdentificacion;
    protected Atraccion atraccion;
    protected ServicioMantenimiento cra;
    
    public ComponenteAveriable(String numero, ServicioMantenimiento cra){
        this.numeroIdentificacion = numero;
        this.cra = cra;
    }
    
    public void setAtraccion(Atraccion atraccion){
        this.atraccion = atraccion;
    }
    
    public void detectarAnomalia(){
        System.out.println("Componente "+ numeroIdentificacion + " Anomalia detectada");
        solicitarMantenimiento();
    }

    public void solicitarMantenimiento() {
        System.out.println("Componente "+ numeroIdentificacion + " Solicitando mantenimiento a la CRA");
        
        if(atraccion != null){
            atraccion.registrarAveriaPendiente();
        }
        
        if(cra != null){
            cra.reportarAveria(this);
        }
    }
    
    public void notificarFinRevision(){
        System.out.println("Componente "+ numeroIdentificacion + " mantenimiento completado");
        
        if(atraccion != null){
            atraccion.anularAveriaPendiente();
        }
    }
    
    public String getNumeroIdentificacion(){
        return numeroIdentificacion;
    }
    
    public Atraccion getAtraccion(){
        return atraccion;
    }
}
