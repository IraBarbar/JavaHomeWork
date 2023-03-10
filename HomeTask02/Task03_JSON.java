/* 
3* . Дана json строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, 
создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
*/
package HomeTask02;

import java.io.*;

public class Task03_JSON {
    public static void main(String[] args) {

        String line = "";
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/j.json");
            File file = new File(pathFile);

            String pathFile2 = pathProject.concat("/j2.txt");
            File file2 = new File(pathFile2);

            if (file.createNewFile()) {
                System.out.println("file.created");
            } else {
                BufferedReader bufReader = new BufferedReader(new FileReader(file));
                while ((line = bufReader.readLine()) != null) {
                    line = (line.replace("[", "")
                            .replace("]", "")
                            .replace(",", " ")
                            .replace("{", "")
                            .replace("}", "")
                            .replace(":", " ")
                            .replace("\"", "")
                            .trim());
                    String[] a = line.split(" ");
                    String name = "";
                    String grade = "";
                    String predmet = "";
                    for (int i = 0; i < a.length; i++) {
                        if (a[i].equals("фамилия") == true)
                            name = a[i + 1];
                        if (a[i].equals("оценка") == true)
                            grade = a[i + 1];
                        if (a[i].equals("предмет") == true)
                            predmet = a[i + 1];
                    }
                    line = "Студент " + name + " получил " + grade + " по предмету " + predmet + ".\n";
                    writeFile(line, file2);
                }
                bufReader.close();
            }
        } catch (Exception e) {
            // e.printStackTrace();
        } finally {
        }
    }

    public static void writeFile(String str, File file) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(str);
            fileWriter.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        } finally{
            System.out.println(str);
        }
    }
}
