package lesson8;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(20, 30);
        Human human = new Human(40, 25);
        Robot robot = new Robot(60, 100);

        Wall wall = new Wall(20);
        Track track = new Track(50);


        Participants[] participant = {cat, human, robot};
        Obstacles[] obstacles = {wall, track};

        for (Participants participants : participant) {
            participants.printInfo();
            for (Obstacles obstacle : obstacles) {
                if (obstacle == wall) {
                    participants.jump(wall);
                } else participants.run(track);
            }

        }


    }
}
