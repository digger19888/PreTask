package part2.task2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String>set1 = new HashSet<>();
        Set<String> set2 = new TreeSet<>();
        for (int i = 0; i<12000000; i++){
            set1.add(i+"abc");
        }
        for (int i = 0; i<12000000; i++){
            set2.add(i+"abc");
        }
        Long startTime = System.currentTimeMillis();
        set1.add(10458153+"abc");
        System.out.println("Время выполнения добавления в HashSet " + ((System.currentTimeMillis()-startTime)) + " мсек.");
        startTime = System.currentTimeMillis();
        set2.add(10459153+"abc");
        System.out.println("Время выполнения добавления в TreeSet " + ((System.currentTimeMillis()-startTime)) + " мсек.");

        startTime = System.currentTimeMillis();
        set1.contains(10458153+"abc");
        System.out.println("Время выполнения поиска элемента в HashSet " + ((System.currentTimeMillis()-startTime)) + " мсек.");
        startTime = System.currentTimeMillis();
        set2.contains(10459153+"abc");
        System.out.println("Время выполнения поиска элемента в TreeSet " + ((System.currentTimeMillis()-startTime)) + " мсек.");

        startTime = System.currentTimeMillis();
        set1.remove(new String(10458153+"abc"));
        System.out.println("Время удаления элемента в HashSet " + ((System.currentTimeMillis()-startTime)) + " мсек.");
        startTime = System.currentTimeMillis();
        set2.remove(new String(10459153+"abc"));
        System.out.println("Время удаления элемента в TreeSet " + ((System.currentTimeMillis()-startTime)) + " мсек.");
    }
}
