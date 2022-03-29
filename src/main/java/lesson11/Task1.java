package lesson11;


import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        String[] strings = {"колбаса", "сосиска", "сарделька", "сосиска", "банан", "помидор",
                "апельсин", "колбаса", "огурец", "капуста", "огурец", "брокколи", "банан", "огурец"};

        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(strings));
        uniqFind(strings);
        wordCount(strings);
    }

    private static void uniqFind(String[] strings) {
        Set<String> stringSet = new HashSet<>(Arrays.asList(strings));
        System.out.println("\nУникальные слова");
        System.out.println(stringSet);


    }

    private static void wordCount(String[] strings) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : strings) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("\nКол-во повторов каждого слова");
        System.out.println(wordCount);


    }


}

