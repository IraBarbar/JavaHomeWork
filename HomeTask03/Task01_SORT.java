// 1.Реализовать алгоритм сортировки слиянием

package HomeTask03;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task01_SORT {

    public static void main(String[] args) {
        int[] arr = addArray();
        System.out.println(Arrays.toString(arr));
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArr(int[] arr) {
        int size = arr.length;
        if (size == 1)
            return; // выход из рекурсии.

        int leftSize = size / 2;
        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[size - leftSize];
        // деление массива на левый:
        for (int i = 0; i < leftSize; i++) {
            leftArr[i] = arr[i];
        }
        // деление массива на правый:
        for (int i = leftSize; i < size; i++) {
            rightArr[i - leftSize] = arr[i];
        }
        sortArr(leftArr);
        sortArr(rightArr);
        merge(arr, leftArr, rightArr);// метод слияния
    }

    private static void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int left = leftArr.length;
        int right = rightArr.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left && j < right) {
            if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
                k++;
            } else {
                arr[k] = rightArr[j];
                j++;
                k++;
            }
        }
        for (int ll = i; ll < left; ll++) {
            arr[k] = leftArr[ll];
            k++;
        }
        for (int rr = j; rr < right; rr++) {
            arr[k] = rightArr[rr];
            k++;
        }
    }

    /**
     * @return
     */
    private static int[] addArray() {
        int size = 10;
        int[] numbers = new int[size];
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        int i = 0;
        while (i < size) {
            int randomNumber = random.nextInt(1, 50);
            if (set.contains(randomNumber) == false) {
                set.add(randomNumber);
                i++;
            }
        }
        numbers = setToArray(set); // в массив из сет:
        return numbers;
    }

    private static int[] setToArray(Set<Integer> set) {
        int [] arr = new int [set.size()];
        int i = 0;
        for (Integer item : set) {
            arr[i++] = item;
        } 
        return arr;
        } 
    }
    
