/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Random;

/**
 *
 * @author Mega Tecnologia
 */
public class Mazo {
    public void crearMazo(){
        Cartas[] mazo=new Cartas[52];
        int valor[]=new int[52];
        int k=52;
        int[] resultado=new int[52];
        Random rnd=new Random();
        int res;
        //se rellena una matriz ordenada del 1 al 31(1..n)
        for(int i=0;i<52;i++){
            valor[i]=i+1;
        }
        
        for(int i=0;i<52;i++){
            res=rnd.nextInt(k);            
            resultado[i]=valor[res];
            valor[res]=valor[k-1];
            k--;
            
        }

        for(int i=0;i<52;i++){
            mazo[i].genCarta(resultado[i]);
        }
    }
}
