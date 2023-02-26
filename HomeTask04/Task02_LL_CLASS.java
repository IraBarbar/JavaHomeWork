/*Реализуйте очередь с помощью LinkedList со следующими методами: 
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя.
*/
package HomeTask04;

public class Task02_LL_CLASS {
    public static void main(String[] args) {
        MyQueue queue01 = new MyQueue();
        System.out.println("Добавляем элементы в очередь:");
        System.out.println(queue01.enqueue(5));
        System.out.println(queue01.enqueue(8));
        System.out.println(queue01.enqueue(10));
        
        System.out.printf("Очередь в порядке добавления элементов, последний добавленный в конце ");
        queue01.showLL();
        System.out.printf("Возвращаем первый элемент из очереди и удаляем его: %s, %s, %s\n",
                queue01.dequeue(), queue01.dequeue(), queue01.dequeue());
        System.out.printf("Есть ли элементы в очереди: %s\n", queue01.empty());
        System.out.printf("Первый элемент в очереди: %s\n", queue01.first());
        System.out.printf("Размер очереди : %s\n", queue01.size());
        System.out.printf("Очередь: ");
        queue01.showLL();

    }
}
