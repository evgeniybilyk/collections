import java.util.*;

public class cMain {
    public static void main(String[] args) {

        System.out.println("Testing collections ...");
        cCollection collection = new cCollection();
        collection.setLength(100000);

        List[] arrCollections = {
                new ArrayList<Integer>(),
                new LinkedList<Integer>()
        };

        Set[] arrSets = {
                new HashSet<Integer>(),
                new TreeSet<Integer>(),
                new LinkedHashSet<Integer>()
        };

        for(List col : arrCollections) {
            collection.cCollectionSet(col);
            collection.collAdd();
            collection.listSet();
            collection.itFor();
            collection.itWhile();
            collection.itForeach();
            collection.delete();
        }

        for(Set set : arrSets) {
            collection.cCollectionSet(set);
            collection.collAdd();
            //collection.listSet(); !!! Не работает
            //collection.itFor();   !!! Не работает какого-то фига
            collection.itWhile();
            collection.itForeach();
            collection.delete();
        }


        System.out.println("Testing synchronized collections ...");
        cSynchronizedCollection synchCollection = new cSynchronizedCollection();
        synchCollection.setLength(100000);

        for(List col : arrCollections) {
            synchCollection.cCollectionSet(col);
            synchCollection.collAdd();
            synchCollection.listSet();
            synchCollection.itFor();
            synchCollection.itWhile();
            synchCollection.itForeach();
            synchCollection.delete();
        }

        for(Set set : arrSets) {
            synchCollection.cCollectionSet(set);
            synchCollection.collAdd();
            //synchCollection.listSet(); !!! Не работает просто
            //synchCollection.itFor();   !!! Не работает какого-то фига
            synchCollection.itWhile();
            synchCollection.itForeach();
            synchCollection.delete();
        }
    }
}
