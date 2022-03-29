package lesson11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "747586214");
        phoneBook.add("Петров", "923568715");
        phoneBook.add("Иванов", "152485632");
        phoneBook.add("Сидоров", "32345871");
        phoneBook.add("Сидоров", "41258477");
        phoneBook.add("Сидоров", "333544411");

        System.out.println(phoneBook.get("Иванов"));
    }

    static class PhoneBook {
        private Map<String, ArrayList<String>> book;

        PhoneBook() {
            this.book = new HashMap<>();
        }

        void add(String lastName, String phoneNumber) {
            ArrayList<String> numbers;

            if (book.containsKey(lastName)) {
                numbers = book.get(lastName);
            } else {
                numbers = new ArrayList<>();
            }
            numbers.add(phoneNumber);
            book.put(lastName, numbers);

        }

        ArrayList<String> get(String lastName) {
            return book.get(lastName);
        }
    }
}
