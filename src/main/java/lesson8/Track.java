package lesson8;

public class Track extends Obstacles {
    private int length;

    public Track(int length) {

        this.length = length;
    }

    public void run(int runCount) {
        if (this.length > runCount) {
            System.out.println("Не добежал");

        } else System.out.println("Дистанция пройдена");
    }
}
