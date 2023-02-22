// 2.Пусть дан произвольный список целых чисел, удалить из него четные числа.

package HomeTask03;

import java.util.ArrayList;
import java.util.Random;

public class Task02_DEL_EVEN {
    public static void main(String[] args) {
        ArrayList <Integer> myList = addArrayList();
        System.out.printf("Первоначальный список: ");
        System.out.println(myList);

        System.out.printf("Список без четных чисел через remove:   ");
        System.out.println(deletEven(myList));

        System.out.printf("Список без четных чисел через removeIf: ");
        System.out.println(deletEvenIF(myList));
    }

    private static ArrayList<Integer> deletEvenIF(ArrayList<Integer> arrList) {
        arrList.removeIf(i -> i % 2 == 0);
        return arrList;
        
    }

    private static ArrayList<Integer> addArrayList() {
        ArrayList<Integer> arrList = new ArrayList<>();
        int size = arrList.size();
        size = 15;
        Random num = new Random();
        for (int i = 0; i < size; i++)
            arrList.add(num.nextInt(0, 100));
        return arrList;
    }

    private static ArrayList<Integer> deletEven(ArrayList<Integer> arrList) {
        if (arrList.size() == 0)
            System.out.println("Нет чисел");
        else {
            for (int i = 0; i < arrList.size(); i++) {
                if (arrList.get(i) % 2 == 0) {
                    arrList.remove(i);
                    i--;
                }
            }
        }
        return arrList;
    }
}
