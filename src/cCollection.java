import java.util.*;

public class cCollection {
    private Collection collection;
    private String className;
    private Integer length;
    private Iterator it;

    /**
     * Constructor
     *
     * @param collection
     */
    public cCollection(Collection collection) {
        this.collection = collection;
        className = this.collection.getClass().getName();

        length = 10;
    }

    /**
     * Method for set collection field
     *
     * @param collection
     */
    public void cCollectionSet(Collection collection) {
        this.collection = collection;
        className = this.collection.getClass().getName();
    }

    /**
     * Method for get Collection field
     *
     * @return Collection
     */
    public Collection cCollectionGet() {
        return collection;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void collAdd() {
        long startTime = System.currentTimeMillis();

        Random rand = new Random();
        for(int i = 0; i < length; i++) {
            collection.add(rand.nextInt(length));
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println(className + " time add elements: " + elapsedTime);
    }

    public void listSet() {
        long startTime = System.currentTimeMillis();

        Random rand = new Random();
        for(int i = 0; i < length; i++) {
            ((List)collection).set(i, rand.nextInt(length));
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println(className + " time set elements: " + elapsedTime);
    }

    public void delete() {
        long startTime = System.currentTimeMillis();

        it = collection.iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println(className + " time delete elements: " + elapsedTime);
    }

    public void collFor() {
        long startTime = System.currentTimeMillis();

        it = collection.iterator();
        for(int i = 0; i < length; i++) {
            Integer val = (Integer) it.next();
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println(className + " time 'For' iteration: " + elapsedTime);
    }

    public void collWhile() {
        long startTime = System.currentTimeMillis();

        Iterator it = collection.iterator();
        while (it.hasNext()) {
            it.next();
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println(className + " time 'While' iteration: " + elapsedTime);
    }
}
