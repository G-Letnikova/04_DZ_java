// Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class DZtask2 {        
    public static void main(String[] args) {
        LinkedList<String> list =  new LinkedList<>();
        enqueue(list, "1");
        enqueue(list, "2");
        enqueue(list, "5");
        enqueue(list, "9");
        enqueue(list, "10");

        System.out.println("удален первый элемент очереди: " + dequeue(list));
        System.out.println(list);

        System.out.println("первый элемент очереди: " + first(list));
        System.out.println(list);

    }
    public static void enqueue(LinkedList<String> list, String str){
        list.addLast(str);
        System.out.println("добавлен элемент: " + list.get(list.size()-1));
        System.out.println(list);
    }

    public static String dequeue(LinkedList<String> list){
        return list.removeFirst();
    }
    public static String first(LinkedList<String> list){
        return list.peek();
    }
}
