/*Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод, который вернет “перевернутый” список. 
Постараться не обращаться к листу по индексам.*/
package HomeTask04;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Task01_REVERS {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue = addQueue();
        System.out.printf("Первоначальный список:");
        System.out.println("\t\t\t" + queue);
        System.out.printf("Перевернутый список через Deque:");
        System.out.println("\t" + reversQueue(queue));
    }

    private static Queue<Integer> addQueue() {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random num = new Random();
        int size = queue.size();
        size = 10;
        for (int i = 0; i < size; i++) {
            queue.add(num.nextInt(0, 20));
        }
        return queue;
    }

    private static Deque<Integer> reversQueue(Queue<Integer> q) {
        Deque<Integer> rev = new ArrayDeque<Integer>();
        int size = q.size();
        for (int index = 0; index < size; index++) {
            rev.addFirst(q.poll());
        }
        return rev;
    }
}
