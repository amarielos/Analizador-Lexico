package AnalizadorLexico;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowReport extends JFrame {

    public Escaneo cont = new Escaneo();
    JPanel panel3 = new JPanel();
    JButton boton2 = new JButton("Regresar");
    public TextArea results = new TextArea();
    JScrollPane sc= new JScrollPane(results);
    JLabel label = new JLabel("Ingresa la ruta del archivo .txt a analizar:");
    TextField _Path = new TextField("Code.txt");
    JButton boton3 = new JButton("Analizar Archivo");
    
    public void Ventana() throws IOException{
        setTitle("Resultados");
        setSize(600,680);
        setVisible(true);
        setLocationRelativeTo(null);
        Panel3();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    public void Panel3() throws IOException{
        this.getContentPane().add(panel3);
        panel3.setBackground(new Color(40,70,90));
        panel3.setLayout(null);
        boton2();
        Resultados();
        Path();
        verJLabel();
        boton3();
    }
    public String Path() throws IOException, FileNotFoundException {
        _Path.setBounds(50, 60, 300, 30);
        _Path.setFont(new Font("SERIF",Font.PLAIN,20));
        _Path.setEditable(true);
        String path = _Path.getText();
        panel3.add(_Path);

        return path;
    }
    private void verJLabel() {
        label.setBounds(50, 20, 350, 30);
        label.setForeground(Color.white);
        label.setFont(new Font("SERIF", Font.PLAIN, 20));
        panel3.add(label);
    }
   
    //TextArea
    public void Resultados() throws IOException{
        results.setBounds(50, 110, 500, 440);
        results.setFont(new Font("SERIF",Font.PLAIN,17));
        //results.append(cont.Resultados());
        results.setEditable(false);
        panel3.add(results);
    }
     
    public void boton2(){
        boton2.setBounds(450, 580, 100, 30);
        panel3.add(boton2);

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
        boton3.setBounds(400, 60, 150, 30);
        panel3.add(boton3);

        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText(null);
                try {
                    results.append(cont.Resultados(Path()));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        };
        boton3.addActionListener(accion);
    }
}
