/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import javax.swing.JOptionPane;

/**
 *
 * @author Mega Tecnologia
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Juego m1=new Juego();
     m1.crearMazo();
     m1.iniciarJuego();
     m1.repartirCartas();
    }
    
}
