package lesson7;

public class Plate {
    private int foodCount;
    private String name;

    public Plate(String name) {
        this.name = name;
        //this.foodCount = foodCount;
    }

    public void printInfo(){
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "В тарелке " + this.name + " сейчас " +
                foodCount +
                " еды";
    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }

    public void decreaseFood(int catEatFoodCount) {
        foodCount -= catEatFoodCount;




    }

    public int getFoodCount() {

            return foodCount;
    }
}
