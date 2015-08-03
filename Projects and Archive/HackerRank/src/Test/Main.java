package Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {


        System.out.println("=== RunnableTest ===");

        // Anonymous Runnable
        Runnable r1 = new Runnable(){

            @Override
            public void run(){
                System.out.println("Hello world one!");
            }
        };

        // Lambda Runnable
        Runnable r2 = () -> {
            int i =0;
            System.out.println("Hello world two!");
            while(true){
                i++;
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Run em!
        r1.run();
        r2.run();

        /**
         * Array Deque Collection Object
         *
         * - not thread-safe
         * - constant amortized cost
         * - Collection and Iterator interfaces
         *
         *
         * - java.lang.Object
         *      java.util.AbstractCollection<E>
         *          java.util.ArrayDeque<E>
         *
         *
         * - Serializable, Cloneable, Iterable<E>, Collection<E>, Deque<E>, Queue<E>
         */


//        ArrayDeque<Integer> collection = new ArrayDeque();
//
//        collection.add(7);
//        collection.add(2);
//        collection.add(3);
//        collection.add(3);
//
//        collection.getFirst();
//        collection.getLast();
//
//
//        for(int element: collection){
//            System.out.println(element);
//        }
//        System.out.println();
//        collection.clear();
//        collection.add(2);
//        collection.add(3);
//        for(int element: collection){
//            System.out.println(element);
//        }

        /**
         * ArrayList Object
         *
         * - resizable
         * -
         *
         * - java.lang.Object
         *      java.util.AbstractCollection<E>
         *          java.util.AbstractList<E>
         *              java.util.ArrayList<E>
         *
         *
         * -  Serializable, Cloneable, Iterable<E>, Collection<E>, List<E>, RandomAccess
         *
         */
//        ArrayList<Integer> collection1 = new ArrayList();
//
//
//        for(int i =0; i< collection1.size(); i++)
//            System.out.println(collection1.get(i));
//
//
//        System.out.println();
//        collection1.add(1);
//        collection1.add(2);
//        collection1.add(3);
//        collection1.add(5);
//
//        System.out.println();
//        for(int i =0; i< collection1.size(); i++)
//            System.out.println(collection1.get(i));
//        System.out.println();
//        Class cl = collection1.getClass();
//
//        Method method = cl.getDeclaredMethod("removeRange", Integer.TYPE, Integer.TYPE);
//
//        method.invoke(collection1, 1, 2);
//
//
//        System.out.println();
//        for(int i =0; i< collection1.size(); i++)
//            System.out.println(collection1.get(i));
//        System.out.println();

        /**
         * Vector Object
         *
         *
         * - java.lang.Object
         *      java.util.AbstractCollection<E>
         *          java.util.AbstractList<E>
         *              java.util.Vector<E>
         *
         * - Serializable, Cloneable, Iterable<E>, Collection<E>, List<E>, RandomAccess
         */
//        Vector<Integer> vector = new Vector<Integer>();
//        for(int i =0; i< vector.size(); i++)
//            System.out.println(vector.get(i));
//        System.out.println();

        //This part is for Lamdas

//        vector.add(1);
//        vector.add(2);
//        vector.add(3);
//        vector.add(5);
//
//        vector.removeIf(p -> {
//            if (p < 6){
//                System.out.println(p.intValue());
//                return true;
//            }
//            else{
//                System.out.println(p);
//                return false;
//            }
//        });
//        System.out.println();
//        System.out.println(vector.size());

        // This is the end

//        System.out.println();
//        for(int i =0; i< vector.size(); i++)
//            System.out.println(vector.get(i));
//        System.out.println();
//        Class cl = vector.getClass();
//        Method method = cl.getDeclaredMethod("remove", Integer.TYPE);
//        method.invoke(vector, 1);
//        System.out.println();
//        for(int i =0; i< vector.size(); i++)
//            System.out.println(vector.get(i));
//        System.out.println();

        /**
         * HashSet Object
         *
         * - Constant time for basic operations
         * - iteration O(n) n- number of elements in the set + Backing HashMap buckets size
         * - not synchronized
         * - Serializable, Cloneable, Iterable<E>, Collection<E>, Set<E>
         *
         *
         */
//        HashSet<Integer> hashSet = new HashSet();
//        hashSet.add(1);
//        hashSet.add(1);
//        hashSet.add(2);
//        hashSet.add(3);
//        hashSet.add(4);
//        hashSet.add(5);
//        hashSet.add(6);
//        Set s = Collections.synchronizedSet(hashSet);
//        System.out.println(s.size());
//        System.out.println(hashSet.contains(5));
//        System.out.println(hashSet.size());


        /**
         * HashMap Object
         *
         * - unsynchronized and permits null
         *
         * - constant time for basic operations
         * - load factor and initial capacity are important
         *
         * - java.lang.Object
         *        java.util.AbstractMap<K,V>
         *           java.util.HashMap<K,V>
         *
         * - Serializable, Cloneable, Map<K,V>
         *
         */
//        HashMap<Integer, String> hashMap = new HashMap();
//
//
//        hashMap.put(16, "Ruben");
//        hashMap.put(4, "Hakob");
//        hashMap.put(5, "Gohar");
//        hashMap.put(5, "Valod");
//
//        for(String element: hashMap.values()){
//            System.out.println(element);
//        }
//
//        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap();
//        linkedHashMap.put(4, "Hakob");
//        linkedHashMap.put(32, "Ruben");
//        linkedHashMap.put(5, "Gohar");
//
//        for(String element: linkedHashMap.values()){
//            System.out.println(element);
//        }



        /**
         * Hashtable Object
         *
         * - hashCode and equals implementation
         *
         * - synchronized no null key and value permitted
         */
//        Hashtable<Integer, String> collection4 = new Hashtable<Integer, String>();


        /**
         * TreeSet Object
         *
         * - not Synchronized
         * - log(n) cost for basic operations
         *
         * - SortedSet s = Collections.synchronizedSortedSet(new TreeSet(...));
         * - Serializable, Cloneable, Iterable<E>, Collection<E>, NavigableSet<E>, Set<E>, SortedSet<E>
         */
//        TreeSet<Integer> treeSet = new TreeSet();
//
//        treeSet.add(4);
//        treeSet.add(1);
//        treeSet.add(3);
//        treeSet.add(2);
//
//        Iterator iter = treeSet.iterator();
//
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }
    }
}