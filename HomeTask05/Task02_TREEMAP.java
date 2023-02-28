/*
 * Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, 
 * Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, 
 * Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, 
 * Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, 
 * Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. 
 * Написать программу, которая найдет и выведет повторяющиеся имена с 
 * количеством повторений. Отсортировать по убыванию популярности. 
 * Для сортировки использовать TreeMap.
 */

package HomeTask05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;

public class Task02_TREEMAP {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>(Arrays.asList("Иван Иванов", "Светлана Петрова",
                "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин",
                "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
                "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"));
        TreeMap<Integer, ArrayList<String>> listPopularity = new TreeMap<>();
        ArrayList<String> name = new ArrayList<>();
        for (String item : employees) {
            String[] arr = item.split(" ");
            name.add(arr[0]);
        }
        Set<String> set = new LinkedHashSet<>(name);
        for (String item : set) {
            int count = Collections.frequency(name, item);
            if (listPopularity.containsKey(count)) {
                ArrayList<String> name1 = listPopularity.get(count);
                name1.add(item);
            } else {
                ArrayList<String> name1 = new ArrayList<>();
                name1.add(item);
                listPopularity.put(count, name1);
            }
        }
        for (HashMap.Entry entry : listPopularity.descendingMap().entrySet()) {
            System.out.println(entry);
        }
    }
}
