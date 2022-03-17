package lesson8;

public class Wall extends Obstacles {

    private int height;

    public Wall(int height) {

        this.height = height;
    }

    public void jump(int jumpCount){
        if (this.height > jumpCount){
            System.out.println("Не допрыгнул");

        } else System.out.println("Успешно перепрыгнул");
    }


}
