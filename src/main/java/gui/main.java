/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui;

import Logic.*;
import Model.*;
import Repository.DispositivoRepositoryImpl;
import Repository.IDispositivoRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author johan
 */
public class main {

    public static void main(String[] args) {
        IDispositivoRepository repoOperarios = new DispositivoRepositoryImpl();
        ServicioMantenimiento cra = new ServicioMantenimiento(repoOperarios);
    
        Dispositivo_Operario o1 = new Dispositivo_Operario("111", "Johan Baltazar", cra);
        Dispositivo_Operario o2 = new Dispositivo_Operario("222", "Valeria Rivera", cra);
        cra.registrarDispositivo(o1);
        cra.registrarDispositivo(o2);
    
        
        Vagon v1 = new Vagon("A-01", cra);
        Vagon v2 = new Vagon("A-02", cra);
        List<Vagon> listaVagones = new ArrayList<>(List.of(v1, v2));
        
        Montaña_Rusa mr = new Montaña_Rusa("Dragon khan", "Calle alamos", 20, listaVagones);
        
        Entrada entradaMR = new Entrada("E-MR-01");
        Salida salidaMR = new Salida("S-MR-01");
        
        mr.setTorniquete(entradaMR, salidaMR);
        entradaMR.setTorniqueteSalida(salidaMR);
        salidaMR.setTorniqueteEntrada(entradaMR);
        
        System.out.println("--- PARQUE ABIERTO ---");
        
        System.out.println("SIMULACION CICLO 1 (NORMAL)");
        
        entradaMR.intentarAbrirAcceso();
        
        for(int i = 0; i < 20; i++) entradaMR.contarPersona();
        System.out.println("Entrada: han entrado "+ entradaMR.getNumeroP()+ " personas");
        
        mr.iniciarViaje();
        mr.detenerViaje();
        
        for(int i = 0; i < 20; i++) salidaMR.simularSalidaPersona();
        
        System.out.println("SIMULACION CICLO 2 (CON AVERIA)");
        
        v1.detectarAnomalia();
        o1.indicarFinRevision();
        
        System.out.println("CRA: INTENTANDO ABRIR TORNIQUETE PARA NUEVO INICIO..." );
        entradaMR.intentarAbrirAcceso();
    }
}
