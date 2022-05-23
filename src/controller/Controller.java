package controller;

import java.util.ArrayList;

import model.Collection;
import view.Terminal;

public class Controller {
    private ArrayList<Collection> collections;
    private Terminal terminal;

    public Controller() {
        collections = new ArrayList<>();
        terminal = new Terminal();
    }

    public Controller(ArrayList<Collection> collections, Terminal terminal) {
        this.collections = collections;
        this.terminal = terminal;
    }
    
    public void init(){
        String cent = "";
        String menu = "Your Pad" + "\n" +
                      "1. View your collections" + "\n" +
                      "2. Find a collection" + "\n" +
                      "3. Create a collection" + "\n\n:";
        int option = 0;
        
        do {
            option = terminal.inputInteger(menu);
            switch (option) {
                case 1 ->
                viewCollections();
                case 2 ->
                findCollection();
                case 3 ->
                createCollection();
                default ->
                terminal.print("Error: Type a valid option");
            }
            cent = terminal.inputString("Do  you want to continue? Y/N ");
        } while (cent.toUpperCase() == "Y");
    }

    private void createCollection() {
        //TODO
    }

    private void findCollection() {
        String id = terminal.inputString("Type the id you want to find: ");

        for (Collection collection : collections) {
            if (collection.findById(id) != null) {
                terminal.print(collection.findById(id).read());
            } else {
                terminal.print("There's not a collection with that id.");
            }
        }
    }

    private void viewCollections() {
        if (collections.isEmpty()) {
            terminal.print("You haven't create a collection yet");
        } else {
            for (Collection collection : collections) {
                collection.read();
            }   
        }
    }

    public ArrayList<Collection> getCollections() {
        return this.collections;
    }

    public void setCollections(ArrayList<Collection> collections) {
        this.collections = collections;
    }

    public Terminal getTerminal() {
        return this.terminal;
    }

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

}
