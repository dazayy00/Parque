/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.Dispositivo_Operario;
import java.util.List;

/**
 *
 * @author johan
 */
public interface IDispositivoRepository {
    Dispositivo_Operario findOperarioLibre();
    List<Dispositivo_Operario> findAll();
    void save(Dispositivo_Operario dispositivo);
}
