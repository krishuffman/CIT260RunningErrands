/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import java.util.Scanner;

/**
 *
 * @author Kris
 */
public class BuyMenuView extends View{

    public BuyMenuView() {
        super("\n"
                  + "\n------------------------------------"
                  + "\n| Buy Menu                        |" 
                  + "\n------------------------------------"
                  + "\nS - Select item."
                  + "\nR - Return to game menu"
                  + "\n-------------------------"
                  + "\nPlease select an Store option: ");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "S": //select items to buy.
                this.openSelectItmesMenu();
                break;
            case "R": //return to game menu.
                this.openGameMenu();
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        return false;

}

    private void openSelectItmesMenu() {
       SelectItmesMenu SelectItmesMenu = new SelectItmesMenu();
       SelectItmesMenu.display();
    }

     private void openGameMenu() {
       GameMenuView GameMenuView = new GameMenuView();
       GameMenuView.display();
    }
}