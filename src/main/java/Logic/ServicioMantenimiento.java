/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Model.ComponenteAveriable;
import Model.Dispositivo_Operario;
import Repository.IDispositivoRepository;

/**
 *
 * @author johan
 */
public class ServicioMantenimiento {
    private final IDispositivoRepository dispositivoRepo;
    
    public ServicioMantenimiento(IDispositivoRepository dispositivoRepo){
        this.dispositivoRepo = dispositivoRepo;
    }
    
    public void reportarAveria(ComponenteAveriable componente){
        System.out.println("CRA recibida averia de "+ componente.getNumeroIdentificacion() +
                " en "+ componente.getAtraccion().getNombre());
        
        Dispositivo_Operario operario = dispositivoRepo.findOperarioLibre();
    
        if(operario != null){
            System.out.println("CRA asignado tarea a "+ operario.getNombreOperario());
            operario.indicarOcupado(componente);
        }else {
            System.out.println("CRA peticion no puede ser atendida. queda en espera");
        }
    }
    
    public void reportarFinTarea(Dispositivo_Operario operario){
        System.out.println("CRA operario "+ operario.getNombreOperario()+ " Ha quedado libre");
    }
    
    public void RegistrarDispositivo(Dispositivo_Operario dispositivo){
        dispositivoRepo.save(dispositivo);
    }
}
