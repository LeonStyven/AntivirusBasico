/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 *
 * @author Pablo
 */
public class LectorArchivo {
    
    //atributo entrada    
    private File archivo;
    
    //atributo salida
    private byte [] bytesArchivo;

    public LectorArchivo(File archivo) {
        
        this.archivo = archivo;
        
    }
      
    public byte [] leerArchivo () throws IOException {
        
        bytesArchivo = Files.readAllBytes(this.archivo.toPath());
        
        return bytesArchivo;
        
    }
        
}
