import java.util.*;

public class cMap<K,V> {
    private Map<K,V> map;

    public cMap(Map<K, V> map) {
        this.map = map;
    }

    public Map<K, V> getMap() {
        return map;
    }
}
