/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_9_leer_archivos_txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author hp
 */
public class EVA3_9_LEER_ARCHIVOS_TXT {

    final static String RUTA = "C:\\archivos pm\\doc.txt";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                try {
            readUsingFiles(RUTA);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readUsingFiles(String ruta) throws IOException{
        Path path=Paths.get(ruta);
        
        byte[] bytes=Files.readAllBytes(path);
        System.out.println(new String(bytes));
        

    }
    
}