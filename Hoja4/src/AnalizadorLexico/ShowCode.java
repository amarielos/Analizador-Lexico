package AnalizadorLexico;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShowCode extends JFrame{
    ShowReport result = new ShowReport();
    ReadPrint cont = new ReadPrint();
    JPanel panel2 = new JPanel();
    JButton boton1 = new JButton("Escanear código");
    JButton boton2 = new JButton("Regresar");
    JButton boton3 = new JButton("Mostrar Archivo");
    TextArea code = new TextArea();
    JLabel label = new JLabel("Ingresa la ruta del archivo .txt a analizar:");
    TextField _Path = new TextField("Code.txt");
    JScrollPane sc= new JScrollPane(code);

    public void Ventana() throws IOException{
        setTitle("Archivo");
        setSize(700,680);
        setVisible(true);
        setLocationRelativeTo(null);
        Panel2();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    public void Panel2() throws IOException{
        this.getContentPane().add(panel2);
        panel2.setBackground(new Color(40,70,90));
        panel2.setLayout(null);
        verJLabel();
        boton1();
        boton2();
        boton3();
        Path();
        code();
    }
    
    public void code() throws FileNotFoundException{
        code.setBounds(50, 120, 600, 430);
        code.setFont(new Font("SERIF",Font.PLAIN,17));
        code.setEditable(false);
        panel2.add(code);        
    }

    public String Path() throws IOException, FileNotFoundException{
        _Path.setBounds(50, 70, 350, 30);
        _Path.setFont(new Font("SERIF",Font.PLAIN,20));
        _Path.setEditable(true);
        String path = _Path.getText();
        panel2.add(_Path);

        return path;
    }

    private void verJLabel() {
        label.setBounds(50, 30, 350, 30);
        label.setForeground(Color.white);
        label.setFont(new Font("SERIF", Font.PLAIN, 20));
        panel2.add(label);
    }

    public void boton1(){
        boton1.setBounds(50, 580, 200, 30);
        panel2.add(boton1);

        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShowReport x =new ShowReport();
                try {;
                    x.Ventana();
                } catch (IOException ex) {
                    Logger.getLogger(ShowCode.class.getName()).log(Level.SEVERE, null, ex);
                }dispose();
            }
        };
        boton1.addActionListener(accion);
    } 
    public void boton2(){
        boton2.setBounds(550, 580, 100, 30);
        panel2.add(boton2);

        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenu y=new MainMenu();
                y.Ventana();
                dispose();//cierra ventana anterior
            }
        };
        boton2.addActionListener(accion);
    }

    public void boton3() {
        boton3.setBounds(450, 70, 200, 30);
        panel2.add(boton3);

        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    code.setText(null);
                        try {
                            code.append(cont.Codigo(Path()));
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
            }
        };
        boton3.addActionListener(accion);
    }
}
