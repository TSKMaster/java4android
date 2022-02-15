package lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee[] employeeList = new Employee[5];
        employeeList[0] = new Employee("Иванов Иван", "Инженер", "jnjnjn@mail.ru", "+7142548512", 5000, 30);
        employeeList[1] = new Employee("Петров Петр", "Машинист", "sdffs@mail.ru", "+7142548512", 7000, 41);
        employeeList[2] = new Employee("Сидоров Олег", "Кочегар", "jxcvn@mail.ru", "+7142548512", 10000, 32);
        employeeList[3] = new Employee("Васечкин Василий", "HR", "ghjggh@mail.ru", "+7142548512", 15000, 46);
        employeeList[4] = new Employee("Прогерман Джавист", "Программист", "jnjnjn@mail.ru", "+7142548512", 100500, 54);

        for (Employee employee : employeeList) {
            if (employee.getAge() > 40) {
                System.out.println(employee.toString());
            }


        }


    }
}
