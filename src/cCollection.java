import java.util.*;

public class cCollection {
    private Collection collection;
    private String className;
    private Integer length;

    public cCollection(Collection collection) {
        this.collection = collection;
        className = this.collection.getClass().getName();

        length = 10;
    }

    public void cCollectionSet(Collection collection) {
        this.collection = collection;
        className = this.collection.getClass().getName();
    }

    public Collection cCollectionGet() {
        return collection;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void fillThroughAdd() {
        long startTime = System.currentTimeMillis();

        Random rand = new Random();
        for(int i = 0; i < length; i++) {
            collection.add(rand.nextInt(length));
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println(className + " time add elements: " + elapsedTime);
    }

    public void fillThroughSet() {
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

        Iterator it = collection.iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println(className + " time delete elements: " + elapsedTime);
    }

}
