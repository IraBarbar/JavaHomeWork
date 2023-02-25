// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.
package HomeTask04;

import java.util.LinkedList;

public class MyQueue {
    LinkedList<Integer> myLinkedList = new LinkedList<>();
    int length = 0;
    int element;

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

    int first() {
        element = myLinkedList.peekFirst();
        return element;
    }

    int dequeue() {
        element = myLinkedList.removeFirst();
        return element;
    }

    void showLL() {
        System.out.println(myLinkedList);
    }

}
