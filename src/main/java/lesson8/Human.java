package lesson8;

public class Human implements Participants{

    int runCount;
    int jumpCount;

    public Human(int runCount, int jumpCount) {
        this.runCount = runCount;
        this.jumpCount = jumpCount;
    }



    @Override
    public void run(Track track) {
        System.out.println("Бег");
        track.run(runCount);

    }


    @Override
    public void jump(Wall wall) {
        System.out.println("Прыжок");
        wall.jump(jumpCount);


    }

    @Override
    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Человек";
    }
}
