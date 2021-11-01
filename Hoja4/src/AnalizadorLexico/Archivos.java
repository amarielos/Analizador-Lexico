/*
ESTA CLASE FUE USADA SOLO EN LA VERSION DE CONSOLA
*/

package AnalizadorLexico;

import java.io.*;

public class Archivos {
       
    public void imprimir() throws FileNotFoundException, IOException{
        
        //variables de resultados
        String a="Parentesis abierto en la posicion: ",b="Parentesis cerrado en la posicion: ",c="Corchete abierto en la posicion: ";       
        String d="Corchete cerrado en la posicion: ",e="Llave abierta en la posicion: ",f="Llave cerrada en la posicion: ";
        String g="Signo de suma en la posición: ",h="Signo de resta en la posición: ",I="Signo de división en la posición: ";
        String j="Signo de multiplicación en la posición: ",res = "",rest = "";
        
        //leer archivo
        File archivo = new File ("h.txt");
        FileReader fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea= br.readLine(),tex = "";
        char[] lineaC;
        
        
        //imprimir el texto
        System.out.println("El contenido del archivo es:");
        System.out.println("");        
        while((linea=br.readLine())!=null){            
            System.out.println(linea);  //imprime linea a linea           
            tex+=linea; //texto completo            
        }            
        
        //escaneo
        lineaC=tex.toCharArray();  
        System.out.println("");
        System.out.println("RESULTADOS");
        System.out.println("");
        for (int i = 0; i < lineaC.length; i++) {                
        char var = lineaC[i];                 
            switch(var){
                case '(':
                    res=a+i+"\n"; 
                    System.out.println(res);
                    rest+=res;
                    break;
                case ')':
                    res=b+i+"\n";
                    System.out.println(res);
                    rest+=res;
                    break;                    
                case '[':
                    res=c+i+"\n";
                    System.out.println(res);
                    rest+=res;
                    break;
                case ']':
                    res=d+i+"\n";
                    System.out.println(res);
                    rest+=res;
                    break;
                case '{':
                    res=e+i+"\n";
                    System.out.println(res);
                    rest+=res;
                    break;
                case '}':
                    res=f+i+"\n";
                    System.out.println(res);
                    rest+=res;
                    break;
                case '+':
                    res=g+i+"\n";
                    System.out.println(res);
                    rest+=res;
                    break;
                case '-':
                    res=h+i+"\n";
                    System.out.println(res);
                    rest+=res;
                    break;
                case '/':
                    res=I+i+"\n";
                    System.out.println(res);
                    rest+=res;
                    break;
                case '*':
                    res=j+i+"\n";
                    System.out.println(res);
                    rest+=res;
                    break;
            }
        } 
        
        
        //escritura de archivo
        FileWriter fw = new FileWriter("resultados.txt");
        fw.write(rest);
        fw.close();
    }   
}
