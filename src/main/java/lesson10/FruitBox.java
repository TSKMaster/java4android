package lesson10;

import java.util.ArrayList;


public class FruitBox<E extends Fruit> {

    private ArrayList<E> fruitBox = new ArrayList<>();

    public void addFruit(E fruit, int quantity) {
        for (int i = 0; i < quantity; i++) {
            fruitBox.add(fruit);
        }
    }


    public float getWeight() {
        float weight = 0.0f;

        for (E fruit : fruitBox) {
            weight += fruit.getWeight();
        }

        return weight;
    }

    public boolean compare(FruitBox compareBox) {
        if (this.getWeight() == compareBox.getWeight()) {
            return true;
        }
        return false;

    }

    public void printInfo() {
        for (E fruit : fruitBox
        ) {
            System.out.println(fruit);
        }
    }

    public void transferTo(FruitBox<E> secondBox) {
        secondBox.fruitBox.addAll(fruitBox);
        fruitBox.clear();
    }
}
