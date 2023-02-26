// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.

package HomeTask05;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.jar.JarException;

public class Task01 {
    public static void main(String[] args) {

        Directory directory = new Directory();
        Menu menu = new Menu();
        
        Scanner iScanner = new Scanner(System.in, "UTF-8");
        System.out.println(menu.startMenu(iScanner));
        
        iScanner.close();
        

        
    }

    static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static ArrayList<String> inputPhone(Scanner iScanner) {
        ArrayList<String> phones = new ArrayList<>();
        boolean no = false;
        while (!no) {
            System.out.printf("Введите телефон: ");
            String phone = System.console().readLine();
            phones.add(phone);
            System.out.printf("Хотите ввести еще номер телефона (1/2):\n 1. Да\n 2. Нет\n ");
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

    static HashMap<String, ArrayList<String>> addContact(String name, ArrayList<String> phoneContact) {
        HashMap<String, ArrayList<String>> contact = new HashMap<>();
        contact.put(name, phoneContact);
        return contact;
    }

}
