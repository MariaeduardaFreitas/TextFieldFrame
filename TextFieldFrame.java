
package maria;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame{
    
    private JTextField textField1; //campo de texto com tamanho configurado
    private JTextField textField2; //campo de texto construído com texto
    private JTextField textField3; //campo de texto com texto e tamanho
    private JPasswordField passwordField; //campo de senha com texto
    
    //construtor adiciona JTextField    s a JFrame
    public TextFieldFrame(){
        
        super("Testando JTextField e JPasswordField");
        setLayout(new FlowLayout()); // configura layout
        
        textField1 = new JTextField (10); //cria textfield com 10 colunas
        add(textField1); //adiciona ao JFrame
        
        textField2 = new JTextField("Um texto aqui"); //constrói campo de teto com texto padrão
        add(textField2); //adiciona ao JFrame
        
        textField3 = new JTextField("Texto 3 (inalterável)", 21); //constrói com texto padrão e 21 colunas
        textField3.setEditable(false); //desativa edição
        add(textField3); // adiciona ao JFrame
        
        passwordField = new JPasswordField("Texto oculto"); //cria com texto padrão
        add(passwordField); //adiciona ao JFrame
        
       TextFieldHandler handler = new TextFieldHandler(); //"Handlers de eventos registradores"
       textField1.addActionListener (handler);
       textField2.addActionListener (handler);
       textField3.addActionListener (handler);
       passwordField.addActionListener (handler);
         
    }
    
    private class TextFieldHandler implements ActionListener{ //classe interna para tratamento de eventos 
            
        public void actionPerformed(ActionEvent event){ //processa eventos no campo de texto
            
            String letra = ""; //declara a String a ser exibida
            
            if(event.getSource() == textField1){
                letra = String.format("textField1: %s", event.getActionCommand());
            }else if(event.getSource() == textField2){
                letra = String.format("textField2: %s", event.getActionCommand());
            }else if(event.getSource() == textField3){
                letra = String.format("textField3: %s", event.ActionCommand());
            }else if(event.getSource() == passwordField){
                letra = String.format("passwordField: %s", event.getActionCommand());
            }
            
            JOptionPane.showMessageDialog(null, letra);
        }
            
    }
}
