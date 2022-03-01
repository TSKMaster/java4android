package lesson7;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        Cat cat1 = new Cat("Максимус Прайм", 25);
        Cat cat2 = new Cat("Григорий", 50);

        Plate plate1 = new Plate("№1");
        Plate plate2 = new Plate("№2");

        plate1.setFoodCount(150);
        plate2.setFoodCount(25);


        plate1.printInfo();
        plate2.printInfo();

        Cat[] cats = {cat1, cat2};
        Plate[] plates = {plate1, plate2};

        for (int i = 0; i < cats.length; i++) {

            cats[i].eat(plates[i]);

        }

  //    Задание 2

        /*while (plate.getFoodCount() > 0){

            cat.eat(plate);


            if (plate.getFoodCount() <= 0) {
                System.out.println("В тарелке недостаточно еды");
                break;
            }

            plate.printInfo();
            Thread.sleep(1000);
        }*/
    }

}
