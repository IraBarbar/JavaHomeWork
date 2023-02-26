package HomeTask05;
import HomeTask05.Directory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.jar.JarException;

public class Menu {
    String pathProject = System.getProperty("user.dir");
    String pathFile = pathProject.concat("/directory.json");
    File file = new File(pathFile);
    int userChoice;

    Directory directory = new Directory();

    int startMenu(Scanner iScanner) {

        String userChoice;
        System.out.println("Выберите пунк меню:" +
        "\n1. Помотреть все контакты." +
        " \n2. Добавить контакт. ");
        userChoice = iScanner.next();
        return Integer.parseInt(userChoice);
    }
    
    boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * @param userChoice
     */
    void punkt(int userChoice){
        switch (userChoice) {
            case 1:
            try {
                directory.readFile(pathFile);
            } catch (JarException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }    
                break;
            case 2:
            HashMap<String, ArrayList<String>> contact = addContact(directory.inputName(iScanner), inputPhone(iScanner));
            try {
                directory.writeFile(contact, file);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        
            default:
                break;
        }
    }
}
