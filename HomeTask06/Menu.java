package HomeTask06;

import java.util.HashMap;
import java.util.Scanner;

public class Menu {
  
    public static Scanner iScanner = new Scanner(System.in);    
    public static int numInvalid = 10;

    public static HashMap<String, Object> searchParametrs = new HashMap<>(allInclusive()); 
    public static void setSearchParametrs(HashMap<String, Object> searchParametrs) {   
        Menu.searchParametrs =startFiltr(iScanner, searchParametrs);
    }

    private static void showMenu() {
        System.out.println("\tFilter (Select item number): \n" +
                "\t1. Color laptop.\n" +
                "\t2. Operating memory.\n" +
                "\t3. Drive capacity.\n" +
                "\t4. Operating system.\n" +
                "\t5. TO START SEARCHING.");
    }

    public static int punkt(Scanner iScanner) {
        showMenu();
        String num = "";
        num = iScanner.next();
        if (isDigit(num)) {
            if (Integer.parseInt(num) > 0)
                return Integer.parseInt(num);
            else {
                System.out.println("Invalid number!");
                punkt(iScanner);
            }
        } else {
            System.out.println("Invalid number!");
            punkt(iScanner);
        }
        return numInvalid;
    }
    
    public static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }     

    public static HashMap<String, Object> startFiltr(Scanner iScanner, HashMap<String, Object> searchParametrs ) {        
        switch (punkt(iScanner)) {
            case 1:
            searchParametrs.put("color", colorSelect(iScanner));
            startFiltr(iScanner, searchParametrs);
            break;
            case 2:
            searchParametrs.put("memory", memorySelect(iScanner));
            startFiltr(iScanner, searchParametrs);
            break;
            case 3:
            searchParametrs.put("drive", driveSelect(iScanner));
            startFiltr(iScanner, searchParametrs);
            break;
            case 4:
            searchParametrs.put("os", osSelect(iScanner));
            startFiltr(iScanner, searchParametrs);
            break;
            case 5:
            break;
            default:
            System.out.println("Invalid number!");
            startFiltr(iScanner, searchParametrs);
            break;
        }
        return searchParametrs;
    }

    public static void colorShow() {
        System.out.println("\tSelect color:\n" +
                "\t1. Black\n" +
                "\t2. Silver");
    }
    
    private static String colorSelect(Scanner iScanner) {
        colorShow();
        String numColor = "";
        numColor = iScanner.next();
        if (isDigit(numColor)) {
            if (Integer.parseInt(numColor) == 1)
            return "black";
            if (Integer.parseInt(numColor) == 2)
            return "silver";
            else {
                System.out.println("Invalid number!");
                colorSelect(iScanner);
            }
        } else {
            System.out.println("Invalid number!");
            colorSelect(iScanner);
        }
        return "";
    }
    
    public static void memoryShow() {
        System.out.println("\tSelect operating memory:\n" +
                "\t1. from 16\n" +
                "\t2. from 32\n" +
                "\t3. from 64");
    }
    private static Object memorySelect(Scanner iScanner) {
        memoryShow(); 
        String punkt = "";
        punkt = iScanner.next();
        if (isDigit(punkt)) {
            if (Integer.parseInt(punkt) == 1)
            return 16;
            if (Integer.parseInt(punkt) == 2)
            return 32;
            if (Integer.parseInt(punkt) == 3)
            return 64;
            else {
                System.out.println("Invalid number!");
                memorySelect(iScanner);
            }
        } else {
            System.out.println("Invalid number!");
            memorySelect(iScanner);
        }
        return 0;
    }

    public static void driveShow() {
        System.out.println("\tSelect drive capacity.:\n" +
                "\t1. from 256 GB\n" +
                "\t2. from 512 GB\n" +
                "\t3. from 1 TB\n" +
                "\t4. from 2 TB");
    }
    private static Object driveSelect(Scanner iScanner) {
        driveShow();; 
        String punkt = "";
        punkt = iScanner.next();
        if (isDigit(punkt)) {
            if (Integer.parseInt(punkt) == 1)
            return 256;
            if (Integer.parseInt(punkt) == 2)
            return 512;
            if (Integer.parseInt(punkt) == 3)
            return 1024;
            if (Integer.parseInt(punkt) == 4)
            return 2048;
            else {
                System.out.println("Invalid number!");
                driveSelect(iScanner);
            }
        } else {
            System.out.println("Invalid number!");
            driveSelect(iScanner);
        }
        return 0;
    }

    public static void osShow() {
        System.out.println("\tSelect operating system:\n" +
                "\t1. no OS\n" +
                "\t2. Windows 10\n" +
                "\t3. Windows 10 Pro\n" +
                "\t4. Linux");
    }
    
    private static String osSelect(Scanner iScanner) {
        osShow();
        String punkt = "";
        punkt = iScanner.next();
        if (isDigit(punkt)) {
            if (Integer.parseInt(punkt) == 1)
            return "no os";
            if (Integer.parseInt(punkt) == 2)
            return "Windows 10";
            if (Integer.parseInt(punkt) == 3)
            return "Windows 10 Pro";
            if (Integer.parseInt(punkt) == 4)
            return "Linux";
            else {
                System.out.println("Invalid number!");
                osSelect(iScanner);
            }
        } else {
            System.out.println("Invalid number!");
            osSelect(iScanner);
        }
        return "";
    }
    
    public static HashMap<String, Object> allInclusive() {
        HashMap<String, Object> searchParametrs = new HashMap<>();
        searchParametrs.put("color", "");
        searchParametrs.put("memory", 0);
        searchParametrs.put("ssd", 0);
        searchParametrs.put("os", "");
        return searchParametrs;            
    }

    public Menu() {
        iScanner.close();
    }
}
