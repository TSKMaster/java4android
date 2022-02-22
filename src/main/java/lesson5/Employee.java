package lesson5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int money;
    private int age;

    public Employee(String name, String position, String email, String phoneNumber, int money, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.money = money;
        this.age = age;
    }

    @Override
    public String toString() {
        return  "Имя: " + name +
                ", Должность: " + position +
                ", E-mail " + email +
                ", Тел.: " + phoneNumber +
                ", Зарплата: " + money +
                ", Возраст: " + age ;
    }


    public int getAge() {
        return age;
    }


}
