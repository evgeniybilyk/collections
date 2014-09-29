import java.util.*;

public class cMain {
    public static void main(String[] args) {
        cCollection collection;

        //Testing class ArrayList
        collection = new cCollection(new ArrayList());
        collection.setLength(10000);

        List[] collections = {
                new ArrayList(),
                new LinkedList()
        };

        for(List col : collections) {
            collection.cCollectionSet(col);
            collection.collAdd();
            collection.listSet();
        }

        Set[] sets = {
                new HashSet<Integer>(),
                new TreeSet<Integer>(),
                new LinkedHashSet<Integer>()
        };

        for(Set set : sets) {
            collection.cCollectionSet(set);
            collection.collAdd();
            //collection.listSet();
        }

        //collection.fillThroughAdd();
        //System.out.println(collection.cCollectionGet());
        //collection.delete();
        //System.out.println(collection.cCollectionGet());
        //collection.fillThroughSet();

        //Testing class LinkedList
        //collection.cCollectionSet(new LinkedList());
        //collection.fillThroughAdd();
        //System.out.println(collection.cCollectionGet());
        //collection.delete();
        //System.out.println(collection.cCollectionGet());
        //collection.fillThroughSet();
    }
}
