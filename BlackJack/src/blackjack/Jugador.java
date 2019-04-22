/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;

/**
 *
 * @author Mega Tecnologia
 */
public class Jugador {
   public String nombre;
    public ArrayList<Cartas> mano=new ArrayList<>();
    public int dinero;
    public int puntos;
    public int score;
    public int apuesta;
    public boolean pedirCarta=true;
    
}
