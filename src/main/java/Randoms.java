import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randoms implements Iterable<Integer> {
    private final Random random;
    private final RandomsIterator randomsIterator;
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        random = ThreadLocalRandom.current();
        randomsIterator = new RandomsIterator();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return randomsIterator;
    }

    private class RandomsIterator implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt(min, max);
        }
    }
}
