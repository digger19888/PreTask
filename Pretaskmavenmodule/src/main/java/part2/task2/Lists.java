package part2.task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<Integer>list1 = new ArrayList<>();
        List<Integer>list2 = new LinkedList<>();
        for (int i = 0; i<20000000; i++){
            list1.add(i);
        }
        for (int i = 0; i<20000000; i++){
            list2.add(i);
        }
        Long startTime = System.currentTimeMillis();
        list1.add(104581530);
        System.out.println("Время выполнения добавления в ArrayList " + ((System.currentTimeMillis()-startTime)) + " мсек.");
        startTime = System.currentTimeMillis();
        list2.add(104591530);
        System.out.println("Время выполнения добавления в LinkedList " + ((System.currentTimeMillis()-startTime)) + " мсек.");

        startTime = System.currentTimeMillis();
        list1.contains(104893330);
        System.out.println("Время выполнения поиска элемента в ArrayList " + ((System.currentTimeMillis()-startTime)) + " мсек.");
        startTime = System.currentTimeMillis();
        list2.contains(106963330);
        System.out.println("Время выполнения поиска элемента в LinkedList " + ((System.currentTimeMillis()-startTime)) + " мсек.");

        startTime = System.currentTimeMillis();
        list1.remove(new Integer(104581530));
        System.out.println("Время удаления элемента в ArrayList " + ((System.currentTimeMillis()-startTime)) + " мсек.");
        startTime = System.currentTimeMillis();
        list2.remove(new Integer(104591530));
        System.out.println("Время удаления элемента в LinkedList " + ((System.currentTimeMillis()-startTime)) + " мсек.");
     }
}
