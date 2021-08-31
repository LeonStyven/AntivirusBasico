package Modelo;

/**
 *
 * @author Julian Styven Colorado Agudelo
 * @author Pablo Loaiza Mejía
 */
public class Virus {
    
    private String nobreVirus;
    private byte [] secuenciaVirus;

    public Virus(String nobreVirus, byte[] secuenciaVirus) {
        this.nobreVirus = nobreVirus;
        this.secuenciaVirus = secuenciaVirus;
    }
    public byte[] getSecuenciaVirus() {
        return secuenciaVirus;
    }
    
}
