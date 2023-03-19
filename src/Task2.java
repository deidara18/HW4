import java.util.LinkedList;

public class Task2 {
    //    Реализуйте очередь с помощью LinkedList со следующими методами:
//    enqueue() - помещает элемент в конец очереди,
//    dequeue() - возвращает первый элемент из очереди и удаляет его,
//    first() - возвращает первый элемент из очереди, не удаляя.
    public static void main(String[] args) {
        LinkedList<Integer> number_list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            number_list.add(i);
        }
            System.out.println(number_list);
            System.out.println(enqueue(10, number_list));
            System.out.println(dequeue(number_list));
            System.out.println(first(number_list));
    }

    public static LinkedList<Integer> enqueue(Integer el, LinkedList<Integer> elList) {
        elList.addLast(el);
        return elList;
    }

    public static Integer dequeue(LinkedList<Integer> elList) {
        int num = elList.getFirst();
        elList.removeFirst();
//        System.out.println(first);
//        System.out.println(array);
        return num;
    }

    public static Integer first(LinkedList<Integer> elList) {
        return elList.getFirst();
    }
}
