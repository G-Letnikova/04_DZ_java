// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.Arrays;
import java.util.LinkedList;


public class DZtask1 {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>(Arrays.asList(1,2,5,6,8,10));
        System.out.println(list);
        System.out.println(FlipList(list));
    
    }
    public static LinkedList<Integer> FlipList(LinkedList<Integer> lst) {
        LinkedList <Integer> resultList = new LinkedList<>();
        while (!lst.isEmpty()) 
            resultList.addFirst(lst.remove());
        return resultList;
    }
}
