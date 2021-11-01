package AnalizadorLexico;
import java.io.*;

public class ReadPrint { 
    
    
    
    public String Codigo(String path) throws FileNotFoundException, IOException{
        //leer archivo
        String ruta = path;
        File archivo = new File (ruta);
        FileReader fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea, tex="";
        
        //imprimir el texto       
        while((linea=br.readLine())!=null){            
            //System.out.println(linea);  //imprime linea a linea en consola
            tex+=linea+"\n"; //texto completo almacenado
        } 
        return tex;    
    }
    
    
    public String Diccionario() throws FileNotFoundException, IOException{
        //leer archivo1
        File archivo = new File ("Diccionario.txt");
        FileReader fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader(fr);

        //leer archivo2
        File dic = new File ("Diccionario2.txt");
        FileReader fr3 = new FileReader (dic);
        BufferedReader br3 = new BufferedReader(fr3);
        String linea, tex="";

        //leer archivo3
        File dic3 = new File ("Diccionario3.txt");
        FileReader fr4 = new FileReader (dic3);
        BufferedReader br4 = new BufferedReader(fr4);
        
        //imprimir el texto       
        while((linea=br.readLine())!=null){ 
            tex+=linea+"\n"; //texto completo almacenado
        }
        while ((linea=br3.readLine())!=null){
            tex+=linea+"\n"; //texto completo almacenado
        }
        while ((linea=br4.readLine())!=null){
            tex+=linea+"\n"; //texto completo almacenado
        }

        return tex;    
    }
}