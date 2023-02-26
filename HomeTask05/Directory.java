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
    String pathProject = System.getProperty("user.dir");
    String pathFile = pathProject.concat("/directory.json");
    File file = new File(pathFile);

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
            System.out.println(num);
        } catch (Exception e) {
            // e.printStackTrace();
        } finally {
        }

    }

    String inputName(Scanner iScanner) {
        System.out.printf("Введите Фамилию: ");
        String name = iScanner.next();
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
}
