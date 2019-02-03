/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * I did this shiet
 */
package telnetshiet;
import java.util.Scanner;

/**
 *
 * @author syslo
 */
public class TelnetShiet {
    public static String actualMenu = "main";
    public static String[] actualOptions = {};
    public static void loginScreen() {
    }
    public static void mainScreen() {
        doTelnetHeader();
        System.out.println("1. Do shome shits");
        System.out.println("2. Do another shits");
        System.out.println("3. Run World of Tanks");
        System.out.println("4. Exit");
        System.out.print("Choose one > ");           
    }
    
    public static void doScreen(String menuID) {
        switch (menuID) {
            case "login": loginScreen();break;
            case "main" : mainScreen();break;
        }
    }
    
    public static void doClrScr() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();          
    }

    public static void doTelnetHeader() {
        doClrScr();        
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
                doScreen(actualMenu);             
                choosen = enteredstring.next();
            } while(!choosen.equals("4"));
    }
    
}
