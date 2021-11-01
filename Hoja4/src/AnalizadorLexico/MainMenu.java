package AnalizadorLexico;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
Esta clase es la interfaz con el menu principal
 */
public class MainMenu extends JFrame {
    JPanel panel = new JPanel();
    JButton boton1 = new JButton("Abrir código");
    JButton boton2 = new JButton("Abrir Diccionario");
    JButton boton3 = new JButton("Salir");

    public void Ventana(){
        setTitle("Menú");
        setSize(500,600);
        setVisible(true);
        setLocationRelativeTo(null);
        Panel();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void Panel(){
        this.getContentPane().add(panel);
        panel.setBackground(new Color(40,70,90));
        panel.setLayout(null);
        boton1();
        boton2();
        boton3();
    }
    public void boton1(){
        boton1.setBounds(150, 200, 200, 30);
        panel.add(boton1);

        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShowCode prueba = new ShowCode();
                try {
                    prueba.Ventana();
                } catch (IOException ex) {
                    Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
                    dispose();
            }
        };
        boton1.addActionListener(accion);
    }
    public void boton2(){
        boton2.setBounds(150, 250, 200, 30);
        panel.add(boton2);

        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            ShowDictionary prueba = new ShowDictionary();
                try {
                    prueba.Ventana();
                } catch (IOException ex) {
                    Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
                    dispose();
            }
        };
        boton2.addActionListener(accion);
    }
    public void boton3(){
        boton3.setBounds(150, 300, 200, 30);
        panel.add(boton3);

        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        boton3.addActionListener(accion);
    }    
}