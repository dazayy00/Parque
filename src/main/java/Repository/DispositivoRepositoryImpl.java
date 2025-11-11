/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Dispositivo_Operario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author johan
 */
public class DispositivoRepositoryImpl implements IDispositivoRepository{
    private List<Dispositivo_Operario> dispositivos = new ArrayList<>();
    
    @Override
    public Dispositivo_Operario findOperarioLibre(){
        return dispositivos.stream()
                .filter(Dispositivo_Operario::isLibre)
                .findFirst()
                .orElse(null);
    }
    
    @Override
    public List<Dispositivo_Operario> findAll(){
        return dispositivos;
    }
    
    @Override
    public void save(Dispositivo_Operario dispositivo){
        dispositivos.add(dispositivo);
    }
}