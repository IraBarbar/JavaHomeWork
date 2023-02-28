// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.

package HomeTask05;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.jar.JarException;

public class Task01_MENU {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/HomeTask05/directory.json");
        File file = new File(pathFile);

        Directory directory = new Directory();
        Scanner iScanner = new Scanner(System.in, "UTF-8");

        
        punkt( pathFile, directory, file, iScanner);
        iScanner.close();
    }

    static int startMenu(Scanner iScanner, Directory directory) {
        String numMenu = "";
        System.out.println("\tSelect menu item:" +
                "\n\t1. View all contacts." +
                "\n\t2. Add contact." +
                "\n\t3. Edit contact." +
                "\n\t4. Exit.");
        numMenu = iScanner.next();
        if (directory.isDigit(numMenu)) {
            return Integer.parseInt(numMenu);
        } else {
            System.out.println("Invalid number!");
            startMenu(iScanner, directory);
        }
        return 10;
    }

    static void punkt( String pathFile, Directory directory, File file, Scanner iScanner) {
        switch (startMenu(iScanner, directory)) {
            case 1:
                try {
                    directory.readFile(pathFile);
                } catch (JarException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                punkt(pathFile, directory, file, iScanner);;
                break;
            case 2:
                HashMap<String, ArrayList<String>> contact = directory.addContact(directory.inputName(iScanner),
                        directory.inputPhone(iScanner));
                try {
                    directory.writeFile(contact, file);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                punkt(pathFile, directory, file, iScanner);;
                break;
            case 3:
                try {
                    directory.editContact(pathFile, iScanner);
                } catch (JarException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                punkt(pathFile, directory, file, iScanner);;
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid number!");
                punkt(pathFile, directory, file, iScanner);;
                break;
        }
    }
}
