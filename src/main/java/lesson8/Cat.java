package lesson8;

public class Cat implements Participants{
    int runCount;
    int jumpCount;

    public Cat(int runCount, int jumpCount) {
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

    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Кот";
    }
}
