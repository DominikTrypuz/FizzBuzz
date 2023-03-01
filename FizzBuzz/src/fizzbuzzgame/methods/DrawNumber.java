package fizzbuzzgame.methods;

import java.util.Random;

public class DrawNumber {
    public static int drawNumber() {
        Random random = new Random();

        int i = random.nextInt(1, 100);
        return i;
    }
}
