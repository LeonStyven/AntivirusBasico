/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Pablo
 */
public class Virus {
    
    private String nombreVirus;
    private byte [] secuenciaVirus;

    public Virus(String nombreVirus, byte[] secuenciaVirus) {
        this.nombreVirus = nombreVirus;
        this.secuenciaVirus = secuenciaVirus;
    }

    public byte[] getSecuenciaVirus() {
        return secuenciaVirus;
    }
    
    
}
