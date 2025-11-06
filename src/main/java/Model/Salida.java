/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author johan
 */
public class Salida extends Torniquete{
    private int personasEsperadas = 0;
    private Entrada torniqueteEntrada;
    
    public Salida(String id){
        super(id);
    }
    
    public void setTorniqueteEntrada(Entrada entrada){
        this.torniqueteEntrada = entrada;
    }
    
    public void setPersonasEsperadas(int esperadas){
       this.personasEsperadas = esperadas;
       this.resetearContador();
    }
    
    public void abrirse(){
        System.out.println("torn-salida ("+ getIdTor() +") Abierto, puede salir");
    }
    
    public void cerrarse(){
        System.out.println("torn-salida " + getIdTor() + " Cerrado");
    }
    
    public void simularSalidaPersona(){
        contarPersona();
        System.out.println("Torn-salida "+ getIdTor() + " Ha salido 1 persona. total: " + getNumeroP());
        
        if(getNumeroP() == personasEsperadas){
            System.out.println("Torn-salida " + getIdTor() +" todos han salido");
            cerrarse();
            
            torniqueteEntrada.intentarAbrirAcceso();
        }
    }
}
