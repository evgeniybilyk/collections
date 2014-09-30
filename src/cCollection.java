import java.util.*;

public class cCollection
{
    /**
     * Collection collection ...
     */
    private Collection collection;

    /**
     * String className ...
     */
    private String className;

    /**
     * Integer length ...
     */
    private Integer length;

    /**
     * Iterator it ...
     */
    private Iterator it;

    /**
     * Class Constructor with param ...
     *
     * @param collection
     */
    public cCollection(Collection collection) {
        this.collection = collection;
        className = this.collection.getClass().getName();

        length = 10;
    }

    /**
     * Class Constructor without params ...
     */
    public cCollection() {
        //To change body of created methods use File | Settings | File Templates.
    }

    /**
     * Method for set collection field
     *
     * @param collection
     * @return void
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

    /**
     * Method for get field length
     *
     * @return Integer
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Method for set field length
     *
     * @param length
     * @return void
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * Method for add items in collections
     *
     * @return void
     */
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

    /**
     * Method for add items in collections using Set
     *
     * @return void
     */
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

    /**
     * Method for delete items from collections
     *
     * @return void
     */
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

    /**
     *
     * @return void
     */
    public void itForeach() {
        long startTime = System.currentTimeMillis();

        it = collection.iterator();
        for(Object i : collection) {
            //TODO something
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println(className + " time 'Foreach' iteration: " + elapsedTime);
    }

    /**
     *
     * @return void
     */
    public void itFor() {
        long startTime = System.currentTimeMillis();

        it = collection.iterator();
        for(int i = 0; i < length; i++) {
            it.next();
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println(className + " time 'For' iteration: " + elapsedTime);
    }

    /**
     *
     * @return void
     */
    public void itWhile() {
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
