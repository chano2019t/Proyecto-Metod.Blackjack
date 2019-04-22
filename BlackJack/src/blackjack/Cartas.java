/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Mega Tecnologia
 */
public class Cartas {

    int numero;
    int pinta;
    int valor;

    public Cartas() {
    }

    public Cartas(int numero, int pinta) {
        this.numero = numero;
        this.pinta = pinta;
    }

    public void genCarta(int v) {
        switch (v) {
            case 1:
                pinta = 1;
                numero = 1;
                break;
            case 2:
                pinta = 1;
                numero = 2;
                break;
            case 3:
                pinta = 1;
                numero = 3;
                break;
            case 4:
                pinta = 1;
                numero = 4;
                break;
            case 5:
                pinta = 1;
                numero = 5;
                break;
            case 6:
                pinta = 1;
                numero = 6;
                break;
            case 7:
                pinta = 1;
                numero = 7;
                break;
            case 8:
                pinta = 1;
                numero = 8;
                break;
            case 9:
                pinta = 1;
                numero = 9;
                break;
            case 10:
                pinta = 1;
                numero = 10;
                break;
            case 11:
                pinta = 1;
                numero = 11;
                break;
            case 12:
                pinta = 1;
                numero = 12;
                break;
            case 13:
                pinta = 1;
                numero = 13;
                break;
            case 14:
                pinta = 2;
                numero = 1;
                break;
            case 15:
                pinta = 2;
                numero = 2;
                break;
            case 16:
                pinta = 2;
                numero = 3;
                break;
            case 17:
                pinta = 2;
                numero = 4;
                break;
            case 18:
                pinta = 2;
                numero = 5;
                break;
            case 19:
                pinta = 2;
                numero = 6;
                break;
            case 20:
                pinta = 2;
                numero = 7;
                break;
            case 21:
                pinta = 2;
                numero = 8;
                break;
            case 22:
                pinta = 2;
                numero = 9;
                break;
            case 23:
                pinta = 2;
                numero = 10;
                break;
            case 24:
                pinta = 2;
                numero = 11;
                break;
            case 25:
                pinta = 2;
                numero = 12;
                break;
            case 26:
                pinta = 2;
                numero = 13;
                break;
            case 27:
                pinta = 3;
                numero = 1;
                break;
            case 28:
                pinta = 3;
                numero = 2;
                break;
            case 29:
                pinta = 3;
                numero = 3;
                break;
            case 30:
                pinta = 3;
                numero = 4;
                break;
            case 31:
                pinta = 3;
                numero = 5;
                break;
            case 32:
                pinta = 3;
                numero = 6;
                break;
            case 33:
                pinta = 3;
                numero = 7;
                break;
            case 34:
                pinta = 3;
                numero = 8;
                break;
            case 35:
                pinta = 3;
                numero = 9;
                break;
            case 36:
                pinta = 3;
                numero = 10;
                break;
            case 37:
                pinta = 3;
                numero = 11;
                break;
            case 38:
                pinta = 3;
                numero = 12;
                break;
            case 39:
                pinta = 3;
                numero = 13;
                break;
            case 40:
                pinta = 4;
                numero = 1;
                break;
            case 41:
                pinta = 4;
                numero = 2;
                break;
            case 42:
                pinta = 4;
                numero = 3;
                break;
            case 43:
                pinta = 4;
                numero = 4;
                break;
            case 44:
                pinta = 4;
                numero = 5;
                break;
            case 45:
                pinta = 4;
                numero = 6;
                break;
            case 46:
                pinta = 4;
                numero = 7;
                break;
            case 47:
                pinta = 4;
                numero = 8;
                break;
            case 48:
                pinta =4;
                numero = 9;
                break;
            case 49:
                pinta = 4;
                numero = 10;
                break;
            case 50:
                pinta = 4;
                numero = 11;
                break;
            case 51:
                pinta = 4;
                numero = 12;
                break;
            case 52:
                pinta = 4;
                numero = 13;
                break;

        }
    }
    public void mostrarCarta(Cartas[] cartas){
        String pin="";
        int num=numero;
        if(this.pinta==1)pin="Picas";
        if(this.pinta==2)pin="Corazones";
        if(this.pinta==3)pin="Treboles";
        if(this.pinta==4)pin="Diamantes";
        for(int i=0;i<4;i++){
            System.out.println("Carta "+i+": "+num+" de "+pin);
        }
    }
}
