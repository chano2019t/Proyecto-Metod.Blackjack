/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack.graficos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Alumno
 */
public class VentanaPrinc extends JFrame{
    public static final int ANCHO=640;
    public static final int ALTO=360;
    public static JPanel panelP;
    public JPanel inicio=new JPanel();
    public JLabel imagenFondo;
    public JButton iniciarJuego;
    public JButton salirdelJuego;
    
    public VentanaPrinc(){
        iniciarComponentes();
    }
    
    public void iniciarComponentes(){
        inicio=new JPanel();
        inicio.add(iniciarJuego);
        inicio.add(salirdelJuego);
        
        panelP=new JPanel();
        imagenFondo=new JLabel();
        iniciarJuego=new JButton();
        salirdelJuego=new JButton();
        
        iniciarJuego.setText("Jugar");
        salirdelJuego.setText("Salir");
        
        
       
    }
    
}
