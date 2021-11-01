package AnalizadorLexico;
import java.io.*;
import java.util.ArrayList;

public class Escaneo {

    //instancia de la clase Code
    public ArrayList<String> getcode(String path) throws IOException {
        String ruta = path;
        Code code = new Code();
        ArrayList<String> codeArray = new ArrayList<>();
        codeArray = code.getCode(ruta);

        return codeArray;
    }

    //resultados de comparacion con datos de 1 caracter
    String Resultado1(String path) throws IOException {

        //instancia de clase Diccionario, devuelve arraylist con contenido del diccionario
        Diccionarios dic = new Diccionarios();
        ArrayList<String> dicArray = new ArrayList<>();
        dicArray = dic.getDiccionario();//array con el diccionario


        //devuelve el contenido del codigo a analizar
        String ruta = path;
        ArrayList<String> codeArray = getcode(ruta);

        String lineaCalc, tex1 = "";
        char[] lineaC;
        int contL;

        //contenido del reporte
        int diclen = dicArray.size();
        int i, j;

        for (i = 0; i < diclen; i++) {
            contL = 1;
            String lineaDic = dicArray.get(i);
            char simb = lineaDic.charAt(0);
            for (String s : codeArray) {
                lineaCalc = s;
                lineaC = lineaCalc.toCharArray();
                for (j = 0; j < lineaC.length; j++) {
                   try {
                        char var = lineaC[j],var2 = lineaC[j+1];
                        if (var == simb) {
                            if (simb == var2){
                                j++;
                            }else {
                                String res = "       " + lineaDic + " posición " + (j + 1) + ", linea " + contL;
                                tex1 += res + "\n";
                            }
                        }
                    }catch (ArrayIndexOutOfBoundsException ignored){}
                }contL++;
            }
        }return tex1;
    }

    //resultados de comparacion con datos de 2 caracteres
    public String Resultado2(String path) throws IOException {

        //instancia de clase Diccionario, devuelve arraylist con contenido del diccionario
        Diccionarios dic2 = new Diccionarios();
        ArrayList<String> dic2Array = new ArrayList<>();
        dic2Array = dic2.getDiccionario2();//array con el diccionario

        //devuelve el contenido del codigo a analizar
        String ruta = path;
        ArrayList<String> codeArray = getcode(ruta);

        String lineaCalc, tex2 = "";
        char[] lineaC;
        int contL;

        //contenido del reporte
        int diclen = dic2Array.size();
        int i, j;

        for (i = 0; i < diclen; i++) {
            contL = 1;
            String lineaDic = dic2Array.get(i);
            char simb = lineaDic.charAt(0), simb2 = lineaDic.charAt(1);
            for (String s : codeArray) {

                lineaCalc = s;
                lineaC = lineaCalc.toCharArray();
                for (j = 0; lineaC.length  > j; j++) {
                    try {
                        char var = lineaC[j], var2 = lineaC[j+1], var3 = lineaC[j+2];
                        if (var == simb) {
                                if (var2 == simb2) {
                                    if (var3 == simb2) {
                                        j++;
                                    }else{
                                        String res2 = "       " + lineaDic + " posición " + (j + 1) + ", linea " + contL;
                                        tex2 += res2 + "\n";
                                    }
                                }
                        }
                    }catch (ArrayIndexOutOfBoundsException ignored){}
                }
                contL++;
            }
        }return tex2;
    }


    //resultados de comparacion con palabras reservadas
    public String Resultado3(String path) throws IOException {

        //instancia de clase Diccionario, devuelve arraylist con contenido del diccionario
        Diccionarios dic3 = new Diccionarios();
        ArrayList<String> dic3Array = new ArrayList<>();
        dic3Array = dic3.getDiccionario3();//array con el diccionario

        //devuelve el contenido del codigo a analizar
        String ruta = path;
        ArrayList<String> codeArray = getcode(ruta);

        String tex3 = "";
        int contL;
        int diclen = dic3Array.size(), codelen = codeArray.size();
        int i, j;

        for (i = 0; i < diclen; i++) {
            contL = 1;
            String[] linedic = dic3Array.get(i).split(" ");
            String concept = linedic[0];
            for (j = 0; j < codelen; j++) {
                String line = codeArray.get(j);
                String[] lineArray = line.split(" ");
                for (int k = 0; k < lineArray.length; k++){
                    String word = lineArray[k];
                    if (concept.equals(word)) {
                        String res3 = "       Palabra reservada '" + concept + "', linea " + contL;
                        tex3 += res3 + "\n";
                    }
                }contL++;
            }
        }return tex3;
    }

    public String Resultado4(String path) throws IOException {

        //instancia de clase Diccionario, devuelve arraylist con contenido del diccionario
        Diccionarios dic4 = new Diccionarios();
        ArrayList<String> dic4Array = new ArrayList<>();
        dic4Array = dic4.getDiccionario4();//array con el diccionario

        // devuelve el contenido del codigo a analizar
        String ruta = path;
        ArrayList<String> codeArray = getcode(ruta);

        String lineaCalc, tex4 = "";
        char[] lineaC;
        int contL;

        //contenido del reporte
        int diclen = dic4Array.size();
        int i, j;

        for (i = 0; i < diclen; i++) {
            contL = 1;
            String lineaDic = dic4Array.get(i);
            char simb = lineaDic.charAt(0), simb2 = lineaDic.charAt(1), simb3 = lineaDic.charAt(2);
            for (String s : codeArray) {
                lineaCalc = s;
                lineaC = lineaCalc.toCharArray();
                for (j = 0; lineaC.length  > j; j++) {
                    try {
                        char var = lineaC[j], var2 = lineaC[j+1], var3 = lineaC[j+2];
                        if (var == simb) {
                            if (var2 == simb2) {
                                if (var3 == simb3) {
                                    String res3 = "       " + lineaDic + " posición " + (j + 1) + ", linea " + contL;
                                    tex4 += res3 + "\n";
                                }
                            }
                        }
                    }catch (ArrayIndexOutOfBoundsException ignored){}
                }
                contL++;
            }
        }return tex4;
    }

    //escribe el archivo resultados
    public String Resultados(String path) throws FileNotFoundException, IOException{
        String ruta = path;
        //escritura de reporte
        String text = Resultado1(ruta) +"\n"+ Resultado2(ruta)+"\n"+ Resultado3(ruta);
        String text1 = "\n"+Resultado4(ruta);
        String TEXT = text + text1;
        FileWriter fw = new FileWriter("resultados.txt");
        fw.write(TEXT);
        fw.close();
        return TEXT;
    }

}