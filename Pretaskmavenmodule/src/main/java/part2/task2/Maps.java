package part2.task2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String>map2 = new TreeMap<>();
        for (int i = 0; i<15000000; i++){
            map1.put(i,"abc"+i);
        }
        for (int i = 0; i<15000000; i++){
            map2.put(i,"abc"+i);
        }
        Long startTime = System.currentTimeMillis();
        map1.put(10458153,"abc104581530");
        System.out.println("Время выполнения добавления в ArrayList " + ((System.currentTimeMillis()-startTime)) + " мсек.");
        startTime = System.currentTimeMillis();
        map2.put(10459153,"abc104591530");
        System.out.println("Время выполнения добавления в LinkedList " + ((System.currentTimeMillis()-startTime)) + " мсек.");

        startTime = System.currentTimeMillis();
        map1.containsValue("abc104581530");
        System.out.println("Время выполнения поиска элемента в ArrayList " + ((System.currentTimeMillis()-startTime)) + " мсек.");
        startTime = System.currentTimeMillis();
        map2.containsValue("abc104591530");
        System.out.println("Время выполнения поиска элемента в LinkedList " + ((System.currentTimeMillis()-startTime)) + " мсек.");

        startTime = System.currentTimeMillis();
        map1.remove(10458153,"abc104581530");
        System.out.println("Время удаления элемента в ArrayList " + ((System.currentTimeMillis()-startTime)) + " мсек.");
        startTime = System.currentTimeMillis();
        map2.remove(10459153,"abc104591530");
        System.out.println("Время удаления элемента в LinkedList " + ((System.currentTimeMillis()-startTime)) + " мсек.");
    }
}
