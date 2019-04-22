/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Mega Tecnologia
 */
public class Juego {

    Cartas[] mazo = new Cartas[52];
    Jugador Player = new Jugador(this);
    Jugador COM = new Jugador(this);

    public void crearMazo() {

        int valor[] = new int[52];
        int k = 52;
        int[] resultado = new int[52];
        Random rnd = new Random();
        int res;
        //se rellena una matriz ordenada del 1 al 52(1..n)
        for (int i = 0; i < 52; i++) {
            valor[i] = i + 1;
        }

        for (int i = 0; i < 52; i++) {
            res = rnd.nextInt(k);
            resultado[i] = valor[res];
            valor[res] = valor[k - 1];
            k--;

        }

        for (int i = 0; i < 52; i++) {
            mazo[i] = new Cartas();
            mazo[i].genCarta(resultado[i]);
        }
    }

    public void iniciarJuego() {
        Player.setNombre();

    }

    public void repartirCartas() {
        int pos = 3;
        boolean bj = false;
        System.out.println("Repartiendo Cartas\n-----------------------");
        System.out.println("Jugador:");

        Player.mano.add(mazo[0]);
        Player.mano.add(mazo[2]);
        for (int i = 0; i < Player.mano.size(); i++) {
            Player.mano.get(i).mostrarCarta();
            Player.puntos = Player.puntos + Player.mano.get(i).valor;
        }
        COM.mano.add(mazo[1]);
        COM.mano.add(mazo[3]);

        if (Player.puntos < 21) {
            System.out.println("PUNTAJE:" + Player.puntos);
            String[] opciones = {"Pedir carta", "Cortar"};
            while (Player.pedirCarta == true) {
                int seleccion = JOptionPane.showOptionDialog(null, "Elija una opcion", "!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                if (seleccion == 1) {
                    Player.pedirCarta = false;
                } else {
                    pos++;
                    Player.mano.add(mazo[pos]);
                    Player.mano.get(Player.mano.size() - 1).mostrarCarta();
                    Player.puntos = Player.puntos + Player.mano.get(Player.mano.size() - 1).valor;

                    if (Player.puntos > 21) {
                        System.out.println("PUNTAJE:" + Player.puntos + "--->Se paso. Perdiste!");
                        Player.pedirCarta = false;
                    } else {
                        System.out.println("PUNTAJE:" + Player.puntos);
                    }
                }
            }
        } else if (Player.puntos == 21) {
            bj = true;
            System.out.println("PUNTAJE:" + Player.puntos + "-->JUGADOR GANA : BLACKJACK!!");
        }

        System.out.println("----------------------\nComputadora:");
        if (Player.puntos <= 21 && bj != true) {

            for (int i = 0; i < COM.mano.size(); i++) {
                COM.mano.get(i).mostrarCarta();
                COM.puntos = COM.puntos + COM.mano.get(i).valor;
                try {
                    //Ponemos a "Dormir" el programa durante los ms que queremos
                    Thread.sleep(1500);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

            if (COM.puntos < 17) {
                System.out.println("PUNTAJE:" + COM.puntos);

                while (COM.pedirCarta == true) {
                    pos++;
                    COM.mano.add(mazo[pos]);
                    COM.mano.get(COM.mano.size() - 1).mostrarCarta();
                    COM.puntos = COM.puntos + COM.mano.get(COM.mano.size() - 1).valor;
                    try {

                        Thread.sleep(1500);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    if (COM.puntos >= 17 && COM.puntos <= 21) {

                        System.out.println("PUNTAJE:" + COM.puntos + "--->La casa se queda");
                        COM.pedirCarta = false;
                    } else if (COM.puntos > 21) {
                        COM.pedirCarta = false;
                        System.out.println("PUNTAJE:" + COM.puntos + "--->La casa pierde");
                    } else {
                        System.out.println("PUNTAJE:" + COM.puntos);
                    }

                }
            } else if (COM.puntos == 21) {
                System.out.println("PUNTAJE:" + COM.puntos + "--->CASA GANA : BLACKJACK!!");
            } else {
                System.out.println("PUNTAJE:" + COM.puntos + "--->La casa se queda.");
            }

        } else {
            Player.puntos = 0;
            COM.puntos = 1;
        }
        if (Player.puntos > COM.puntos) {
            JOptionPane.showMessageDialog(null, "¡JUGADOR GANA!");
        } else if (Player.puntos < COM.puntos) {
            JOptionPane.showMessageDialog(null, "!LA CASA GANA!");
        } else {
            JOptionPane.showMessageDialog(null, "!EMPATE!");
        }
    }

}
