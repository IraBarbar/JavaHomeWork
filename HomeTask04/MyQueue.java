// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.
package HomeTask04;

import java.util.LinkedList;

public class MyQueue {
    private LinkedList<Integer> myLinkedList = new LinkedList<>();
    private int length = 0;
    private int element;

    int size() {
        length = myLinkedList.size();
        return length;
    }

    LinkedList<Integer> enqueue(int n) {
        myLinkedList.add(n);
        return myLinkedList;
    }

    boolean empty() {
        return myLinkedList.isEmpty();
    }

    Integer first() {
        if (!empty()) {
            element = myLinkedList.peekFirst();
            return element;
        }
        return null;
    }

    Integer dequeue() {
        if (!empty()) {
            element = myLinkedList.removeFirst();
            return element;
        } else
            return null;
    }

    void showLL() {
        System.out.println(myLinkedList);
    }
}
