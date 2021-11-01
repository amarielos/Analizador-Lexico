package AnalizadorLexico;

import java.io.*;
import java.util.ArrayList;

/*
Esta clase lee cada diccionario y retorna un arraylist de strings diferente por cada archivo
 */
public class Diccionarios {

    //diccionario 1 caracter
    public ArrayList<String> getDiccionario() throws IOException {
        File dic = new File ("Diccionario.txt");
        FileReader fr2 = new FileReader (dic);
        BufferedReader br2 = new BufferedReader(fr2);

        ArrayList<String> dicArray = new ArrayList<>();

        //contenido del diccionario
        String lineaDic = br2.readLine();
        while((lineaDic)!=null){
            dicArray.add(lineaDic);
            lineaDic = br2.readLine();
        }return dicArray;
    }

    //diccionario 2 caracteres
    public ArrayList<String> getDiccionario2() throws IOException {
        File dic = new File ("Diccionario2.txt");
        FileReader fr3 = new FileReader (dic);
        BufferedReader br3 = new BufferedReader(fr3);

        ArrayList<String> dic2Array = new ArrayList<>();

        //contenido del diccionario
        String lineaDic = br3.readLine();
        while((lineaDic)!=null){
            dic2Array.add(lineaDic);
            lineaDic = br3.readLine();
        }return dic2Array;
    }

    //diccionario palabras reservadas
    public ArrayList<String> getDiccionario3() throws IOException {
        File dic = new File ("Diccionario3.txt");
        FileReader fr4 = new FileReader (dic);
        BufferedReader br4 = new BufferedReader(fr4);

        ArrayList<String> dic3Array = new ArrayList<>();

        //contenido del diccionario
        String lineaDic = br4.readLine();
        while((lineaDic)!=null){
            dic3Array.add(lineaDic);
            lineaDic = br4.readLine();
        }return dic3Array;
    }

    //diccionario 3 caracteres
    public ArrayList<String> getDiccionario4() throws IOException {
        File dic = new File ("Diccionario4.txt");
        FileReader fr5 = new FileReader (dic);
        BufferedReader br5 = new BufferedReader(fr5);

        ArrayList<String> dic4Array = new ArrayList<>();

        //contenido del diccionario
        String lineaDic = br5.readLine();
        while((lineaDic)!=null){
            dic4Array.add(lineaDic);
            lineaDic = br5.readLine();
        }return dic4Array;
    }


}
