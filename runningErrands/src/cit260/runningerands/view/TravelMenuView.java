/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.GameControl;
import cit260.runningerrands.control.MapControl;
import cit260.runningerrands.model.Location;
import cit260.runningerrands.model.Map;
import cit260.runningerrands.model.Persona;
import runningerrands.RunningErrands;

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */
public class TravelMenuView extends View {
    
    public TravelMenuView(String menu) {
        super(menu);
    }

    public String TravelMenuValues() {
        
        Persona persona = RunningErrands.getPersona();
        Location currentlocation = persona.getLocation();
        String locationSymbol = currentlocation.getScene().getLocationSymbol();
        String menu = RunningErrands.getCurrentGame().getMap().getTravelMapString(locationSymbol);
        
        menu = "\n------------------------------------"
                  + "\n| Map Menu                        |" 
                  + "\n------------------------------------"
                  + "\n" + menu;
        menu += "-------------------------" 
        + "\nPlease select a location to visit \n";
        
        TravelMenuView travelMenuView = new TravelMenuView(menu);
        travelMenuView.display();
        return menu;
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        int newValue = 0;
        try {
            newValue = Integer.parseInt(value);
        } catch (NumberFormatException ne) {
            ErrorView.display(this.getClass().getName(), "Error reading input:" + "\nInvalid selection, please select an option above.");
            return false;
        }
        String newSymbol = String.format("%02d", newValue);
        switch (value) {

            default:
                try {
                    Persona persona = RunningErrands.getPersona();
                    Location currentLocation = persona.getLocation();
                    Map map = RunningErrands.getMap();
                    Location newLocation = map.getLocationFromSymbol(newSymbol);
                    if (currentLocation == newLocation) {
                        String currentLocationDecription = currentLocation.getScene().getDescription();
                        ErrorView.display(this.getClass().getName(), "\nYou are already at " + currentLocationDecription + ", please try again");
                        return false;
                    }
                    else {
                        MapControl.movePersonaToNewLocation(newSymbol);
                        String menu = "";
                        SceneMenuView sceneMenuView = new SceneMenuView(menu);
                        sceneMenuView.SceneMenuValues();
                        return true;
                    }
                } catch (NumberFormatException ne) {
                        ErrorView.display(this.getClass().getName(), "Error reading input:" + "\nInvalid selection, please select an option above.");
                        return false;
                }
        }
               
    }

    private void openMapMenu() {
        this.console.println("\n ***Runs Map menu function ***");
    }

    private void openInventoryMenu() {
        this.console.println("\n ***Runs Inventroy menu function ***");
    }

    private void openInvestmentMenu() {
        //display investment menu
        InvestmentTypeMenuView InvestmentMenuView = new InvestmentTypeMenuView();
        InvestmentMenuView.display();
    }

    private void openGamblingMenu()  {
        //display Gambling menu
        String menu = "";
        GamblingAmountMenuView gamblingAmountMenuView = new GamblingAmountMenuView(menu);
        menu = gamblingAmountMenuView.GamblingMenuValues();
        //GameControl.createNewGame(RunningErrands.getPlayer());
    }

    private void OpensaveGame() {
        // prompt for file path to save game
       this.console.println("\n\nEnter the file path for the folder you wish to save the game to.");
        String filePath = this.getInput();
       try{
           // save the game to the speciried file.
           GameControl.saveGame(RunningErrands.getCurrentGame(), filePath);
       } catch (Exception ex){
            ErrorView.display("SceneMenuView", ex.getMessage());
       }
    }

    private void openLoadGame() {
        this.console.println("\n\nEnter the file path for the folder your game is saved to.");
        String filePath = this.getInput();
       try{
           GameControl.getSavedGame(filePath);
       } catch (Exception ex){
           ErrorView.display("SceneMenuView", ex.getMessage());
       }
    }

    private void openEmailMenu() {
        this.console.println("\n ***Runs email menu function ***");
    }

    private void openHelpMenu() {
        //Display Help Menu
        HelpMenuView HelpMenuView = new HelpMenuView();
        HelpMenuView.display();
    }

    private void openStatsMenu() {
        this.console.println("\n ***Runs stats menu function ***");
    }

    private void openStoreMenu() {
        StoreMenuView StoreMenuView = new StoreMenuView();
        StoreMenuView.display();
    }

    private void openGameMenu() {
        String menu = "";
            SceneMenuView sceneMenuView = new SceneMenuView(menu);
            sceneMenuView.SceneMenuValues();   
    }

    private void travelHome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
