package core.basesyntax;

public class Application {
    private static final int BALLS_COUNT = 10;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < BALLS_COUNT; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
            System.out.println();
        }
    }
}