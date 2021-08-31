package Controladores;

import Modelo.Virus;

/**
 *
 * @author Julian Styven Colorado Agudelo
 * @author Pablo Loaiza Mejía
 */
public class Analizador {
     //Atributo de entrada
    private byte [] bytesArchivo = null;
    
    //vector virus
    private Virus [] listaVirus;
    
    //contador ningun virus
    private int contador = 0;
            
    public Analizador(byte[] bytesArchivo) {
        this.bytesArchivo = bytesArchivo;
    }
    
    //Inicializa la lista de virus
    public void cargarVirus() {
        
        Virus usama = new Virus ("Usama", new byte [] {15, 30, 15, 49}); //13, 10, 60, 47 para provar 
        Virus amtrax = new Virus ("Antrax", new byte [] {72, 72, 15, 29});
        Virus eBola = new Virus ("eBola", new byte [] {29, 32, 53, 29});
        Virus ah1n1 = new Virus ("Ah1N1", new byte [] {72, 32, 32, 20});
        Virus covid19 = new Virus ("covid19", new byte [] {30, 25, 20, 19});
        
        listaVirus = new Virus [5];
        
        listaVirus[0] = usama;
        listaVirus[1] = amtrax;
        listaVirus[2] = eBola;
        listaVirus[3] = ah1n1;
        listaVirus[4] = covid19;
        
    }
    
    //Rastear kas secuencias de virus en los byres del archivo
    public String detectarVirus() {
    
        String virusEncontrado = "";
        
        for (int i = 0; i < bytesArchivo.length; i++) {
            
            //q0
            //Usama
            if (bytesArchivo [i] == listaVirus[0].getSecuenciaVirus()[0]){
                //q1
                if (bytesArchivo [i+1] == listaVirus[0].getSecuenciaVirus()[1]){
                    //q7
                    if (bytesArchivo [i+2] == listaVirus[0].getSecuenciaVirus()[2]) {
                        //q8
                        if (bytesArchivo [i+3] == listaVirus[0].getSecuenciaVirus()[3]) {
                            //q9
                            virusEncontrado = virusEncontrado +  "USAMA encontrado\n";
                            
                            contador++;
                        }
                    }
                }
            //q0
            //Amtrax
            } else if (bytesArchivo [i] == listaVirus[1].getSecuenciaVirus()[0]){
                //q2
                if (bytesArchivo [i+1] == listaVirus[1].getSecuenciaVirus()[1]){
                    //q7
                    if (bytesArchivo [i+2] == listaVirus[1].getSecuenciaVirus()[2]) {
                        //q8
                        if (bytesArchivo [i+3] == listaVirus[1].getSecuenciaVirus()[3]) {
                            //q9
                            virusEncontrado = virusEncontrado +  "AMTRAX encontrado\n";
                            contador++;
                        }
                    }
                }
            //q0
            //eBola
            } else if (bytesArchivo [i] == listaVirus[2].getSecuenciaVirus()[0]){
                //q2
                if (bytesArchivo [i+1] == listaVirus[2].getSecuenciaVirus()[1]){
                    //q6
                    if (bytesArchivo [i+2] == listaVirus[2].getSecuenciaVirus()[2]) {
                        //q3
                        if (bytesArchivo [i+3] == listaVirus[2].getSecuenciaVirus()[3]) {
                            //q9
                            virusEncontrado = virusEncontrado +  "eBola encontrado\n";
                            contador++;
                        }
                    }
                }
            //q0
            //Ah1N1
            } else if (bytesArchivo [i] == listaVirus[3].getSecuenciaVirus()[0]){
                //q2
                if (bytesArchivo [i+1] == listaVirus[3].getSecuenciaVirus()[1]){
                    //q6
                    if (bytesArchivo [i+2] == listaVirus[3].getSecuenciaVirus()[2]) {
                        //q5
                        if (bytesArchivo [i+3] == listaVirus[3].getSecuenciaVirus()[3]) {
                            //q9
                            virusEncontrado = virusEncontrado +  "Ah1N1 encontrado\n";
                            contador++;
                        }
                    }
                }
            //q0
            //Covid19
            } else if (bytesArchivo [i] == listaVirus[4].getSecuenciaVirus()[0]){
                //q4
                if (bytesArchivo [i+1] == listaVirus[4].getSecuenciaVirus()[1]){
                    //q10
                    if (bytesArchivo [i+2] == listaVirus[4].getSecuenciaVirus()[2]) {
                        //q11
                        if (bytesArchivo [i+3] == listaVirus[4].getSecuenciaVirus()[3]) {
                            //q9
                            virusEncontrado = virusEncontrado +"Covid19 encontrado\n";
                            contador++;
                        }
                    }
                }
            }  
        }
        if (contador == 0) {
                virusEncontrado = "No se encontro ningun virus.";
        }
        
        return virusEncontrado;
        
    }
}
