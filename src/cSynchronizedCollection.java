import java.util.*;

public class cSynchronizedCollection extends cCollection {

    /**
     *
     * @param className
     */
    protected void setCollClassName(String className) {
        this.className = className;
    }

    /**
     * Method for set collection field
     *
     * @param collection
     * @return void
     */
    public void cCollectionSet(List collection) {
        this.collection = Collections.synchronizedList(collection);

        setCollClassName("Synchronized " + collection.getClass().getSimpleName());
    }

    /**
     * Method for set collection field
     *
     * @param collection
     * @return void
     */
    public void cCollectionSet(Set collection) {
        this.collection = Collections.synchronizedSet(collection);

        setCollClassName("Synchronized " + collection.getClass().getSimpleName());
    }

}
