/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mega Tecnologia
 */
public class Jugador {
   public String nombre;
    public ArrayList<Cartas> mano=new ArrayList<>();
    public int dinero;
    public int puntos=0;
    public int score=0;
    public int apuesta;
    public boolean pedirCarta=true;
    public Juego game;
    public Jugador(Juego game){
        this.game=game;
    }
    public void setNombre(){
        nombre=JOptionPane.showInputDialog("Ingrese su nombre");
        
        
    }
    
}
