package HomeTask06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Start_DataBase {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Laptop nb01 = new Laptop("black", 16, 256, "no os");
        Laptop nb02 = new Laptop("black", 16, 256, "no os");
        Laptop nb03 = new Laptop("silver", 16, 512, "Windows 10");
        Laptop nb04 = new Laptop("silver", 32, 512, "Windows 10");
        Laptop nb05 = new Laptop("silver", 32, 512, "Windows 10 Pro");
        Laptop nb06 = new Laptop("silver", 32, 1024, "Windows 10 Pro");
        Laptop nb07 = new Laptop("black", 64, 1024, "Linux");
        Laptop nb08 = new Laptop("black", 64, 1024, "Linux");
        Laptop nb09 = new Laptop("black", 64, 2048, "Linux");
        Laptop nb10 = new Laptop("silver", 64, 2048, "Linux");

        List<Laptop> setlap = new ArrayList<>(Arrays.asList(nb01,
                nb02, nb03, nb04, nb05, nb06, nb07, nb08, nb09, nb10));

        HashMap<String, Object> searchParametrs =Menu.startFiltr(Menu.iScanner, Menu.searchParametrs);        
        filterCaplop(searchParametrs, setlap);        
    }

    public static void filterCaplop(HashMap search, List<Laptop> setlap) {
        boolean findLaptop = false;
        for (Laptop laptop : setlap) {
            if (search.get("color") != ""
                    && search.get("os") != ""
                    && laptop.ssd >= (Integer) search.get("ssd")
                    && laptop.memory >= (Integer) search.get("memory")) {
                if (laptop.color.equals(search.get("color")) 
                      &&  laptop.os.equals(search.get("os"))) {
                    laptop.print();
                    findLaptop = true;
                }
            }
            if (search.get("color") == ""
                    && search.get("os") != ""
                    && laptop.ssd >= (Integer) search.get("ssd")
                    && laptop.memory >= (Integer) search.get("memory")) {
                if (laptop.os.equals(search.get("os"))) {
                    laptop.print();
                    findLaptop = true;
                }
            }
            if (search.get("color") != ""
                    && search.get("os") == ""
                    && laptop.ssd >= (Integer) search.get("ssd")
                    && laptop.memory >= (Integer) search.get("memory")) {
                if (laptop.color.equals(search.get("color"))) {
                    laptop.print();
                    findLaptop = true;
                }
            }
            if (search.get("color") == ""
                    && search.get("os") == ""
                    && laptop.ssd >= (Integer) search.get("ssd")
                    && laptop.memory >= (Integer) search.get("memory")) {
                laptop.print();
                findLaptop = true;
            }
        }
        if (!findLaptop)
            System.out.println("Nothing find!");
    }
}
