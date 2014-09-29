import java.util.*;

public class cMain {
    public static void main(String[] args) {
        cCollection collection;

        //Testing class ArrayList
        collection = new cCollection(new ArrayList());
        collection.setLength(10000);

        collection.fillЕhroughAdd();
        //System.out.println(collection.cCollectionGet());
        collection.delete();
        //System.out.println(collection.cCollectionGet());

        //Testing class LinkedList
        collection.cCollectionSet(new LinkedList());
        collection.fillЕhroughAdd();
        //System.out.println(collection.cCollectionGet());
        collection.delete();
        //System.out.println(collection.cCollectionGet());

        Collection lst = new LinkedList();
        ((LinkedList)lst).set(1, "srthsrthsrt");
    }
}
