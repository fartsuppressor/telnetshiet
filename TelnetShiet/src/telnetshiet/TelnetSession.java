/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 *   Telnet Session Class
 *   Bungee
 */
package telnetshiet;

public class TelnetSession {
    private String actualMenu = "main";
    private String[] actualOptions = {};

    public void loginScreen() {
    }
    
    public void mainScreen() {
        doTelnetHeader();
        System.out.println("1. Do shome shits");
        System.out.println("2. Do another shits");
        System.out.println("3. Run World of Tanks");
        System.out.println("4. Exit");
        System.out.print("Choose one > ");           
    }
    
    public void doScreen(String menuID) {
        switch (menuID) {
            case "login": loginScreen();break;
            case "main" : mainScreen();break;
        }
    }
    
    public void doClrScr() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();          
    }

    public void doTelnetHeader() {
        doClrScr();        
        System.out.println("********************************************************************************");
        System.out.println("*                                                                              *");
        System.out.println("*                     fartsuppressors' telnet shiet                            *");        
        System.out.println("*                                                                              *");
        System.out.println("********************************************************************************");        
    }
    
    TelnetSession() {
        
    }
    
    /**
     * Returns the actual menu identifier.
     * @return String The menu ID
     */
    
    public String getActualMenu() {
        return this.actualMenu;
    }
    
    /**
     * Sets the actual session menu to menuID.
     * 
     * @param String menuID What needs to be set.
     * @return Boolean Returns if the actualmenu was set, else returns false
     */
    
    public Boolean setActualMenu(String menuID) {
            if(this.actualMenu.getClass().equals(String.class) && !this.actualMenu.equals("")) {
                this.actualMenu = menuID;
                return true;
        } else {
                return false;
            }
    }
}
