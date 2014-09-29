import java.util.*;

public class cMain {
    public static void main(String[] args) {
        cCollection collection;

        //Testing class ArrayList
        collection = new cCollection(new ArrayList());
        collection.setLength(10000);

        collection.fillThroughAdd();
        //System.out.println(collection.cCollectionGet());
        //collection.delete();
        //System.out.println(collection.cCollectionGet());
        collection.fillThroughSet();

        //Testing class LinkedList
        collection.cCollectionSet(new LinkedList());
        collection.fillThroughAdd();
        //System.out.println(collection.cCollectionGet());
        //collection.delete();
        //System.out.println(collection.cCollectionGet());
        collection.fillThroughSet();
    }
}
