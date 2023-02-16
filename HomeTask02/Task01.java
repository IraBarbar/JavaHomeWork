/*1 . Дана строка sql-запроса "select * from students where ". 
Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: 
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} */

package HomeTask02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;


public class Task01 {

    public static void main(String[] args) {
        String select = "select * from students where city = Minsk ";

        String[] student1 = new String[] { "name", "Ivanov", "country", "Russia", "city", "Moscow", "age", "null" };
        String[] student2 = new String[] { "name", "Petrov", "country", "Belarus", "city", "Minsk", "age", "35" };
        String[] student3 = new String[] { "name", "Sidorov", "country", "Belarus", "city", "Minsk", "age", "40" };

        HashMap<String, String>[] students = new HashMap[] { dict(student1), dict(student2), dict(student3)};
        
        String key = "city";
        if (key != fromSelect(select, student1)) System.out.println("false");
        String valueNo = "null"; // не будет печатать при заданом значении
        String valueYes = "Minsk"; // будет печатать только с таким значением, пустая строка - выведет все значения
        
        findKey(students, key, valueNo, valueYes); 
    }

    private static HashMap dict(String[] arr) {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0)
                map.put(arr[i], arr[i + 1]);
        }
        return map;
    }
    public static String fromSelect(String data, String[] arr) {
        String [] ent = data.split(" ");
        String k = "";
        for (int i = 0; i < ent.length; i++) {
            if (Arrays.asList(arr).contains(ent[i]) == true){
                k = ent[i];
            }  
        }
        return k;
    }

    private static void findKey(HashMap[] maps, String key, String valNo, String valY) {
        for (int i = 0; i < maps.length; i++) {
            ArrayList<HashMap.Entry> entries = new ArrayList<>(maps[i].entrySet());
            for (HashMap.Entry entry : entries) {
                if (valY != "") {
                    if (entry.getKey() == key && entry.getValue() != valNo && entry.getValue() == valY) {
                        System.out.println(entries);
                    }
                } else {
                    if (entry.getKey() == key && entry.getValue() != valNo) {
                        System.out.println(entries);
                    }
                }
            }
        }
    }
}
