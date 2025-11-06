/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author johan
 */
public abstract class Torniquete {
    private int numeroP;
    private String idTor;

    public Torniquete(String id) {
        this.idTor = id;
        this.numeroP = 0;
    }

    public int getNumeroP() {
        return numeroP;
    }
    
    public String getIdTor() {
        return idTor;
    }

    /*
    public void setNumeroP(int numeroP) {
        this.numeroP = numeroP;
    }

    public void setIdTor(String idTor) {
        this.idTor = idTor;
    }*/
    
    public void contarPersona(){
        this.numeroP++;
    }
    
    public void resetearContador(){
        this.numeroP = 0;
    }
}