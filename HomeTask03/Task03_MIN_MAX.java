//3.Задан целочисленный список ArrayList. Найти минимальное, 
//максимальное и среднее арифметическое этого списка.
package HomeTask03;

import java.util.ArrayList;
import java.util.Random;

public class Task03_MIN_MAX {
    public static void main(String[] args) {
        System.out.println("\tПервоначальный список:");
        ArrayList<Integer> myArr = addArrayList();
        System.out.println(myArr);
        System.out.printf("Минимальное число из списка - %d.\n", findMin(myArr));
        System.out.printf("Максимальное число из списка - %d.\n", findMax(myArr));
        System.out.printf("Cреднее арифметическое число из списка %d элементов с суммой %d - %d.\n",
                findMid(myArr)[2], findMid(myArr)[0], findMid(myArr)[1]);
    }

    private static int[] findMid(ArrayList<Integer> arrayList) {
        int sum = 0;
        if (arrayList.size() == 0)
            return null;
        else {
            for (Integer item : arrayList) {
                sum += item;
            }
        }
        int mid = sum / arrayList.size();
        int[] num = new int[] { sum, mid, arrayList.size() };
        return num;
    }

    private static Integer findMax(ArrayList<Integer> arrayList) {
        int max = arrayList.get(0);
        if (arrayList.size() == 0)
            return null;
        else {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) > max) {
                    max = arrayList.get(i);
                }
            }
        }
        return max;
    }

    private static ArrayList<Integer> addArrayList() {
        ArrayList<Integer> arrList = new ArrayList<>();
        int size = arrList.size();
        size = 20;
        Random num = new Random();
        for (int i = 0; i < size; i++)
            arrList.add(num.nextInt(0, 100));
        return arrList;
    }

    private static Integer findMin(ArrayList<Integer> arrayList) {
        int min = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < min) {
                min = arrayList.get(i);
            }
        }
        return min;
    }
}
