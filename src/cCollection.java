import java.util.*;

public class cCollection
{
    /**
     * Collection collection ...
     */
    protected Collection collection;

    /**
     * String className ...
     */
    protected String className;

    /**
     * Integer length ...
     */
    protected Integer length;

    /**
     * Iterator it ...
     */
    protected Iterator it;

    /**
     * Class Constructor with param ...
     *
     * @param collection
     */
    public cCollection(Collection collection) {
        this.collection = collection;
        length = 10;

        setCollClassName();
    }

    /**
     * Class Constructor without params ...
     */
    public cCollection() {
        //To change body of created methods use File | Settings | File Templates.
    }

    protected void setCollClassName() {
        className = this.collection.getClass().getSimpleName();
    }

    public String getCollClassName() {
        if(className == null) {
            setCollClassName();
        }

        return className;
    }

    /**
     * Method for set collection field
     *
     * @param collection
     * @return void
     */
    public void cCollectionSet(Collection collection) {
        this.collection = collection;

        setCollClassName();
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

        System.out.println(className + " time 'add' (" + length + " elements): " + elapsedTime);
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

        System.out.println(className + " time 'set' (" + length + " elements): " + elapsedTime);
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

        System.out.println(className + " time 'remove' (" + length + " elements): " + elapsedTime);
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

        System.out.println(className + " time 'Foreach' iteration (" + length + " elements): " + elapsedTime);
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

        System.out.println(className + " time 'For' iteration(" + length + " elements): " + elapsedTime);
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

        System.out.println(className + " time 'While' iteration (" + length + " elements): " + elapsedTime);
    }
}
