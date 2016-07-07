/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.GameControl;
import runningerrands.RunningErrands;

/**
 *
 * @author reddo
 */
public class ConversationMenuView extends View {
    
    public ConversationMenuView() {
        super("\n"
                  + "\n-------------------------"
                  + "\n| Main Menu             |" 
                  + "\n-------------------------"
                  + "\nN - Start new game"
                  + "\nL - Load saved game"
                  + "\nH - Open Help menu"
                  + "\nQ - Quit Game"
                  + "\n-------------------------"
                  + "\nPlease select a menu option: ");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "N": //create and start a new game
                this.startNewGame();
                break;
            case "L": //load saved game
                this.LoadSavedGame();
                break;
            case "H": //Open help menu
                this.openHelpMenu();
                break;
            case "Q": //Open help menu
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection, please try again");
                break;  
        }

        return false;
    }
    
    private void LoadSavedGame() {
         this.console.println("\n\nEnter the file path for the folder your game is saved to.");
        String filePath = this.getInput();
       try{
           GameControl.getSavedGame(filePath);
       } catch (Exception ex){
           ErrorView.display("GameMenuView", ex.getMessage());
       }
    }
    private void openHelpMenu() {
        //Display Help Menu
        HelpMenuView HelpMenuView = new HelpMenuView();
        HelpMenuView.display();
    }

    private void startNewGame() {
        GameControl.createNewGame(RunningErrands.getPlayer());
        PersonaGenderMenuView createNewPersona = new PersonaGenderMenuView();
        createNewPersona.display();
    }
}
