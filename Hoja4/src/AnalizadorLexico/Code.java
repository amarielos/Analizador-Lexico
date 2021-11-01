package AnalizadorLexico;

import java.io.*;
import java.util.ArrayList;

/*
Esta clase lee el archivo con el codigo a analizar y devuelve un arraylist de strings, cada
linea del codigo se guarda como un string, el tamano del array es igual al numero de lineas.
 */
public class Code {

        public ArrayList<String> getCode(String path) throws IOException {
            String ruta = path;
            File code = new File (ruta);
            FileReader fr = new FileReader (code);
            BufferedReader br = new BufferedReader(fr);

            ArrayList<String> codeArray = new ArrayList<>();

            //contenido del codigo a analizar
            String lineaCode = br.readLine();
            while((lineaCode)!=null){
                codeArray.add(lineaCode);
                lineaCode = br.readLine();
            }
            return codeArray;
        }

}
