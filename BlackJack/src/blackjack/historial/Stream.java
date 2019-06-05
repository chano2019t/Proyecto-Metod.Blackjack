package blackjack.historial;

import blackjack.Jugador;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Stream implements Serializable {

    public static ArrayList<Jugador> usuarios;
    
    

    public static void guardarUsuario(ArrayList dato) throws FileNotFoundException, IOException {
        try {
            ObjectOutputStream salida;
            
            System.out.println(dato.get(0).getClass().getName());
            
                salida = new ObjectOutputStream(new FileOutputStream("DATA.txt"));
                System.out.println("se guardó un objeto compuesto\n");
                salida.writeObject(dato);//writeUnshared(this);
                salida.close();
            

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
            e.getMessage();
        } catch (IOException e) {
            System.out.println("Hubo un error al guardar");
            e.getMessage();
        }
    }

    
}