import java.util.Random;

public class cTestArray {
    private Integer[] intarray;

    public cTestArray() {
        intarray = new Integer[10000];
    }

    public Integer[] getIntArray() {
        Random rand = new Random(47);
        for(int i = 0; i < 10000; i++) {
            intarray[i] = rand.nextInt(40);
        }

        return intarray;
    }
}
