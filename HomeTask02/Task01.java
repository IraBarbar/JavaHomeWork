/*1 . Дана строка sql-запроса "select * from students where ". 
Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: 
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} */

package HomeTask02;

import java.util.ArrayList;
import java.util.HashMap;

public class Task01 {

    public static void main(String[] args) {
        String[] student1 = new String[] { "name", "Ivanov", "country", "Russia", "city", "Moscow", "age", "null" };
        String[] student2 = new String[] { "name", "Petrov", "country", "Belarus", "city", "Minsk", "age", "35" };
        String[] student3 = new String[] { "name", "Sidorov", "country", "Belarus", "city", "Minsk", "age", "40" };

        ArrayList<HashMap<String, String>> students = new ArrayList<>();
        students.add(dict(student1));
        students.add(dict(student2));
        students.add(dict(student3));

        String key = "name";
        String valueNo = "null"; // не будет печатать при заданом значении
        String valueYes = "Petrov"; // будет печатать только с таким значением, пустая строка - выведет все значения

        findKey(students, key, valueNo, valueYes);
    }

    private static HashMap<String, String> dict(String[] arr) {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0)
                map.put(arr[i], arr[i + 1]);
        }
        return map;
    }

    private static void findKey(ArrayList<HashMap<String, String>> maps, String key, String valNo, String valY) {
            for (int i = 0; i < maps.size(); i++) {
            if (maps.get(i).containsKey(key) == true && maps.get(i).containsValue(valY) == true) {
                System.out.println(maps.get(i));   
            }
        }
    }
}
