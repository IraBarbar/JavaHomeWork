//Найдите сумму всех элементов LinkedList, 
//сохраняя все элементы в списке. Используйте итератор
package HomeTask04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Task03_SUM {
    public static void main(String[] args) {
        String name = "Queue";
        Queue<Integer> queue = new LinkedList<Integer>();
        queue = addQueue();
        System.out.printf("Первоначальный список %s: ", name);
        System.out.println(queue);

        System.out.printf("Сумма всех элементов %s: ", name);
        System.out.println(sum(queue));
    }
    private static Queue<Integer> addQueue() {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random num = new Random();
        int size = queue.size();
        size = 5;
        for (int i = 0; i < size; i++) {
            queue.add(num.nextInt(-10, 10));
        }
        return queue;
    }
    private static Integer sum(Queue<Integer> queue) {
        int sum = 0;
        for (Integer integer : queue) {
            sum += integer;
        }
        return sum;
    }
}
