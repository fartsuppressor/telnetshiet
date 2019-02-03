/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telnetshiet;
import java.util.Scanner;

/**
 *
 * @author syslo
 */
public class TelnetShiet {
    public static void mainScreen() {
        System.out.println("1. Do shome shits");
        System.out.println("2. Do another shits");
        System.out.println("3. Run World of Tanks");
        System.out.println("4. Exit");
    }
    
    public static void doScreen(String menuID) {
        switch (menuID) {
            case "main" : TelnetShiet.mainScreen();break;
        }
    }
    
    public static void doClrScr() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();          
    }

    public static void doTelnetHeader() {
        System.out.println("********************************************************************************");
        System.out.println("*                                                                              *");
        System.out.println("*                     fartsuppressors' telnet shiet                            *");        
        System.out.println("*                                                                              *");
        System.out.println("********************************************************************************");        
    }

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
            String choosen = "";
        // TODO code application logic here
            Scanner enteredstring = new Scanner(System.in);
            do {
                doClrScr();
                doTelnetHeader();
                doScreen("main");
                System.out.print("Choose one > ");                
                choosen = enteredstring.next();
            } while(!choosen.equals("4"));
    }
    
}
