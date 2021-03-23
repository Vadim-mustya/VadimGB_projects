package Lesson3;

import java.util.*;

public class Lesson3 {

    static Random random = new Random();
    static String[] words = {"Яблоко","Молоко","Колесо","Макет","Зонт","Мармелад","Зефир","Атланта","Чайник","Люблю котов","Фантазия кончилась."};


    public static void main(String[] args) {


        //Домашнее задание №1.
        checkWords(getArr());

        System.out.println("-----------------------------------------------------------------------------------------------------------------------");

        // Домашнее задание №2.
        PhoneDirectory x = new PhoneDirectory();
        x.get("Петров");

        x.add("Петров","Второй номер");
        x.get("Петров");
        x.add("Новый сотрудник","Номер не указал");
        x.get("Новый сотрудник");

    }

    static List<String> getArr()
    {
        List<String> array = new ArrayList<>();
        for (int i = 0;i < 16;i++)
        {
            array.add(words[random.nextInt(words.length)]);
//            System.out.print(array.get(i) + " ");
        }
        System.out.println();
        return array;
    }

    static void checkWords(List<String> words)
    {
        Map<String, Integer> array = new HashMap<>();

        for(int i = 0;i < words.size();i++)
        {
            array.put(words.get(i),array.getOrDefault(words.get(i), 0) + 1);
        }

        System.out.println(array);


    }


}
