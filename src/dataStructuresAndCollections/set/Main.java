package dataStructuresAndCollections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set set = new HashSet();
        Set<String> set2 = new TreeSet<>(); // SortedSet alt sınıfının ögesi olan TreeSet bu şekilde kullanılabilir
        set.add("Ali");
        set.add("Ahmet");
        set.add("Mehmet");
        set.add("Fatma");
        set2.add("Ali");
        set2.add("Ahmet");
        set2.add("Mehmet");
        set2.add("Fatma");
        //Hashset ögesini bir iterator nesnesine bağladık
        Iterator i = set.iterator();
        while(i.hasNext()){
            System.out.println("Küme elemanı : "+i.next());
        }
        // Sıralı bir şekilde çıktı verir
        Iterator it = set2.iterator();
        while(it.hasNext()){
            System.out.println("Küme elemanı : "+it.next());
        }
    }
}
