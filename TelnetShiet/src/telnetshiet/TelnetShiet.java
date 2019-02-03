/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * I did this shiet at 2019.02.03
 * Bungee
 */
package telnetshiet;
import java.util.Scanner;

public class TelnetShiet {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
            String choosen = "";
            Scanner enteredstring = new Scanner(System.in);
            TelnetSession tSession = new TelnetSession();
            do {
                tSession.doScreen();             
                choosen = enteredstring.next();
            } while(!choosen.equals("4"));
    }
    
}

