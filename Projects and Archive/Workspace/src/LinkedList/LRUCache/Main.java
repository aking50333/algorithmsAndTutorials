package LinkedList.LRUCache;

/**
 * Created by Ruben on 6/21/2015.
 */
public class Main {

    public static void main(String[] args) {

        LeastRecentlyUsedCache cache = new LeastRecentlyUsedCache();

        cache.set(1, 1);
        cache.set(2, 2);
        cache.set(3, 3);
        cache.set(4, 4);
        cache.set(5, 5);
        cache.set(6, 6);
        cache.set(7, 7);
        cache.set(8, 8);
        cache.set(9, 9);

        System.out.println(cache.get(1));

    }
}
