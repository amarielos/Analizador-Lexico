package AnalizadorLexico;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ShowDictionary extends JFrame{
    ReadPrint cont = new ReadPrint();
    JPanel panel3 = new JPanel();
    JButton boton2 = new JButton("Regresar");
    TextArea code = new TextArea();
    JScrollPane sc= new JScrollPane(code);
    
    public void Ventana() throws IOException{
        setTitle("Diccionario");
        setSize(600,700);
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
        Diccionario();
    }   
    //TextArea
    public void Diccionario() throws IOException{
        code.setBounds(50, 50, 500, 520);
        code.setFont(new Font("SERIF",Font.PLAIN,17));
        code.append(cont.Diccionario());
        code.setEditable(false);
        panel3.add(code);        
    } 
    public void boton2(){
        boton2.setBounds(450, 600, 100, 30);
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
}