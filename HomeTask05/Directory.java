package HomeTask05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.jar.JarException;

public class Directory {

    void writeFile(HashMap<String, ArrayList<String>> map, File file) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(map.toString() + "\n");
            fileWriter.close();

        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            System.out.println(map);
        }
    }

    void readFile(String file) throws JarException {
        try {
            List<String> num = Files.readAllLines(Paths.get(file));
            for (String string : num) {
                System.out.println(string.replace("{", "")
                        .replace("}", "")
                        .replace("=", ": "));
            }
        } catch (Exception e) {
            // e.printStackTrace();
        } finally {
        }
    }

    String inputName(Scanner iScanner) {
        System.out.printf("Input namelast: ");
        String name = iScanner.next();
        System.out.printf("Input name: ");
        name = name + " " + iScanner.next();
        return name;
    }

    boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    ArrayList<String> inputPhone(Scanner iScanner) {
        ArrayList<String> phones = new ArrayList<>();
        boolean no = false;
        while (!no) {
            System.out.printf("Input phone number: ");
            String phone = System.console().readLine();
            phones.add(phone);
            System.out.printf("Would you like to enter another phone number (1/2):\n 1. Yes\n 2. No\n ");
            String answer = System.console().readLine();
            if (isDigit(answer)) {
                if (Integer.parseInt(answer) == 2) {
                    no = true;
                    break;
                }
            }
        }
        return phones;
    }

    HashMap<String, ArrayList<String>> addContact(String name, ArrayList<String> phoneContact) {
        HashMap<String, ArrayList<String>> contact = new HashMap<>();
        contact.put(name, phoneContact);
        return contact;
    }

    /**
     * @param file
     * @param iScanner
     * @throws JarException
     */
    void editContact(String file, Scanner iScanner) throws JarException {
        String word = userSearch(iScanner).toLowerCase();
        try {
            List<String> num = Files.readAllLines(Paths.get(file));
            boolean noFind = true;
            for (String string : num) {
                if (string.toLowerCase().indexOf(word) != -1) {
                    System.out.println(string);
                    noFind = false;
                }            
            }
            if (noFind == true) {
                System.out.println("Nothing found!");
            }
        } catch (Exception e) {
            // e.printStackTrace();
        } finally {
        }
    }
    String userSearch(Scanner iScanner){
        String searchWord = "";
        System.out.printf("Enter search value: ");
        searchWord = iScanner.next().trim();
        return searchWord;
    }
}
