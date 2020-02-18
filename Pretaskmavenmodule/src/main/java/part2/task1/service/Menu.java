package part2.task1.service;

import part2.task1.exceeption.FlowerNotExistException;
import part2.task1.exceeption.IllegalOperationException;
import part2.task1.exceeption.NotEmptyBucketException;
import part2.task1.model.Chamomile;
import part2.task1.model.Lily;
import part2.task1.model.Rose;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Bucket bucket = new Bucket();
        while (true) {
            try {

                System.out.println("1 - добавить цветок в букет");
                System.out.println("2 - вывести стоимость букета");
                System.out.println("3 - удалить букет");
                System.out.println("4 - записать цветы из букета в файл");
                System.out.println("5 - прочитать букет из файла");
                System.out.println("6 - прочитать номер цветка из букета");
                System.out.println("7 - создать второй букет");
                System.out.println("8 - выход");
                Scanner scan = new Scanner(System.in);
                int menuNumber = 0;
                try {
                    menuNumber = scan.nextInt();

                } catch (InputMismatchException ex) {
                    System.out.println(ex.toString() + " Вы ввели не число");
                    continue;
                }
                switch (menuNumber) {
                    case 1:
                        System.out.println("1 - Добавить розу");
                        System.out.println("2 - Добавить ромашку");
                        System.out.println("3 - Добавить лилию");
                        scan = new Scanner(System.in);
                        int flowerType = scan.nextInt();
                        System.out.println("Какое количество выбранных цветков добавить?");
                        scan = new Scanner(System.in);
                        int flowerCount = 1;
                        try{
                        flowerCount = Integer.parseInt(scan.next());}
                        catch (NumberFormatException ex){
                            System.out.println("Вы ввели некорректное число. По умолчанию количество цветков 1.");
                        }
                        switch (flowerType) {
                            case 1:
                                for (int i = 0; i < flowerCount; i++) {
                                    Rose rose = new Rose();
                                    bucket.addFlower(rose);
                                }
                                break;
                            case 2:
                                for (int i = 0; i < flowerCount; i++) {
                                    Chamomile chamomile = new Chamomile();
                                    bucket.addFlower(chamomile);
                                }
                                break;
                            case 3:
                                for (int i = 0; i < flowerCount; i++) {
                                    Lily lily = new Lily();
                                    bucket.addFlower(lily);
                                }
                                break;
                            default:
                                throw new FlowerNotExistException("Вы выбрали не существующий цветок.");
                        }
                        break;
                    case 2:
                        System.out.println("Стоимость букета: " + bucket.getBucketPrice() + "р.");
                        break;
                    case 3:
                        bucket = null;
                        break;
                    case 4:
                        bucket.writeBucketToJson();
                        break;

                    case 5:
                        bucket.readBucketFromJson();
                        break;
                    case 6:
                        System.out.println("Введите номер цветка из букета:");
                        scan = new Scanner(System.in);
                        System.out.println("Цвет: " + bucket.getFlowerColor(scan.nextInt()));
                        break;
                    case 7:
                        throw new UnsupportedOperationException("Данный функционал ещё не реализован.");
                    case 8:
                        if (bucket != null){
                            throw new NotEmptyBucketException("Невозможно выйти из меню, пока не удалён букет");
                        }
                        return;
                    default:
                        throw new IllegalOperationException("Вы велли пункт меню ,которого нет");
                }

            } catch (NullPointerException ex) {
                System.out.println(ex.toString() + " Обьект букета не найден. Новый букет будет создан автоматически");
                bucket = new Bucket();
            }
            catch (UnsupportedOperationException ex){
                System.out.println(ex.getMessage());
            }
            catch (IllegalOperationException | NotEmptyBucketException | FlowerNotExistException ex){
                System.out.println(ex.getMessage());
            }
        }

    }
}