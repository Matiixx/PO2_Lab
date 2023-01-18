import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringArrays sa = new StringArrays();
        /////////////////////////////////////////////////////////////////////////////////////////
        // WSTAWIANIE
        /////////////////////////////////////////////////////////////////////////////////////////

        long start = System.nanoTime();
        ArrayList<String> AL = new ArrayList<>();
        for (var el : sa.getT1()) {
            AL.add(el);
        }
        long end = System.nanoTime();
        System.out.println("DODANIE T1 ArrayList:  " + (end - start) / 1000000.0 + " ms");
        //////////////////////////////////////////////////////////////////
        start = System.nanoTime();
        LinkedList<String> LL = new LinkedList<>();
        for (var el : sa.getT1()) {
            LL.add(el);
        }
        end = System.nanoTime();
        System.out.println("DODANIE T1 LinkedList: " + (end - start) / 1000000.0 + " ms");
        //////////////////////////////////////////////////////////////////
        start = System.nanoTime();
        TreeMap<String, Integer> TM = new TreeMap<>();
        for (var el : sa.getT1()) {
            TM.put(el, 1);
        }
        end = System.nanoTime();
        System.out.println("DODANIE T1 TreeMap:    " + (end - start) / 1000000 + " ms");
        //////////////////////////////////////////////////////////////////
        start = System.nanoTime();
        HashMap<String, Integer> HM = new HashMap<>();
        for (var el : sa.getT1()) {
            HM.put(el, 1);
        }
        end = System.nanoTime();
        System.out.println("DODANIE T1 HashMap:    " + (end - start) / 1000000 + " ms");
        //////////////////////////////////////////////////////////////////

        /////////////////////////////////////////////////////////////////////////////////////////
        // WYSZUKIWANIE T2
        /////////////////////////////////////////////////////////////////////////////////////////

        System.out.println();
        start = System.nanoTime();
        for (var el : sa.getT2()) {
            AL.contains(el);
        }
        end = System.nanoTime();
        System.out.println("SZUKANIE T2 ArrayList:  " + (end - start) / 1000000 + " ms");
        //////////////////////////////////////////////////////////////////
        start = System.nanoTime();
        for (var el : sa.getT2()) {
            LL.contains(el);
        }
        end = System.nanoTime();
        System.out.println("SZUKANIE T2 LinkedList: " + (end - start) / 1000000 + " ms");
        //////////////////////////////////////////////////////////////////
        start = System.nanoTime();
        for (var el : sa.getT2()) {
            TM.containsKey(el);
        }
        end = System.nanoTime();
        System.out.println("SZUKANIE T2 TreeMap:    " + (end - start) / 1000000.0 + " ms");
        //////////////////////////////////////////////////////////////////
        start = System.nanoTime();
        for (var el : sa.getT2()) {
            HM.containsKey(el);
        }
        end = System.nanoTime();
        System.out.println("SZUKANIE T2 HashMap:    " + (end - start) / 1000000.0 + " ms");

        /////////////////////////////////////////////////////////////////////////////////////////
        // WYSZUKIWANIE T3
        /////////////////////////////////////////////////////////////////////////////////////////

        System.out.println();
        start = System.nanoTime();
        for (var el : sa.getT3()) {
            AL.contains(el);
        }
        end = System.nanoTime();
        System.out.println("SZUKANIE T3 ArrayList:  " + (end - start) / 1000000 + " ms");
        //////////////////////////////////////////////////////////////////
        start = System.nanoTime();
        for (var el : sa.getT3()) {
            LL.contains(el);
        }
        end = System.nanoTime();
        System.out.println("SZUKANIE T3 LinkedList: " + (end - start) / 1000000 + " ms");
        //////////////////////////////////////////////////////////////////
        start = System.nanoTime();
        for (var el : sa.getT3()) {
            TM.containsKey(el);
        }
        end = System.nanoTime();
        System.out.println("SZUKANIE T3 TreeMap:    " + (end - start) / 1000000.0 + " ms");
        //////////////////////////////////////////////////////////////////
        start = System.nanoTime();
        for (var el : sa.getT3()) {
            HM.containsKey(el);
        }
        end = System.nanoTime();
        System.out.println("SZUKANIE T3 HashMap:    " + (end - start) / 1000000.0 + " ms");

        ///////////////////////////////////////////////////////////////////////////////////////
        // ZADANIE 3
        ///////////////////////////////////////////////////////////////////////////////////////

        System.out.println();
        start = System.nanoTime();
        for (int i = 0; i < AL.size(); i++) {
            AL.get(i);
        }
        end = System.nanoTime();
        System.out.println("PETLA FOR ArrayList:  " + (end - start) / 1000000.0 + " ms");
        //////////////////////////////////////////////////////////////////
        start = System.nanoTime();
        for (int i = 0; i < LL.size(); i++) {
            LL.get(i);
        }
        end = System.nanoTime();
        System.out.println("PETLA FOR LinkedList: " + (end - start) / 1000000.0 + " ms");
        //////////////////////////////////////////////////////////////////
        System.out.println();
        start = System.nanoTime();
        for (var eL : AL) {
        }
        end = System.nanoTime();
        System.out.println("PETLA FOR-EACH ArrayList:  " + (end - start) / 1000000.0 + " ms");
        //////////////////////////////////////////////////////////////////
        start = System.nanoTime();
        for (var el : LL) {
        }
        end = System.nanoTime();
        System.out.println("PETLA FOR-EACH LinkedList: " + (end - start) / 1000000.0 + " ms");
        //////////////////////////////////////////////////////////////////
        System.out.println();
        start = System.nanoTime();
        Iterator<String> it = AL.iterator();
        while (it.hasNext()) {
            it.next();
        }
        end = System.nanoTime();
        System.out.println("PETLA ITERATOR ArrayList:  " + (end - start) / 1000000.0 + " ms");
        //////////////////////////////////////////////////////////////////
        start = System.nanoTime();
        it = LL.iterator();
        while (it.hasNext()) {
            it.next();
        }
        end = System.nanoTime();
        System.out.println("PETLA ITERATOR LinkedList: " + (end - start) / 1000000.0 + " ms");

        /////////////////////////////////////////////////////////////////////////////////////////
        // USUWANIE
        /////////////////////////////////////////////////////////////////////////////////////////

        System.out.println();
        start = System.nanoTime();
        AL.clear();
        end = System.nanoTime();
        System.out.println("USUNIECIE ArrayList:  " + (end - start) / 1000000.0 + " ms");
        //////////////////////////////////////////////////////////////////
        start = System.nanoTime();
        LL.clear();
        end = System.nanoTime();
        System.out.println("USUNIECIE LinkedList: " + (end - start) / 1000000.0 + " ms");
        //////////////////////////////////////////////////////////////////
        start = System.nanoTime();
        TM.clear();
        end = System.nanoTime();
        System.out.println("USUNIECIE TreeMap:    " + (end - start) / 1000000.0 + " ms");
        //////////////////////////////////////////////////////////////////
        start = System.nanoTime();
        HM.clear();
        end = System.nanoTime();
        System.out.println("USUNIECIE HashMap:    " + (end - start) / 1000000.0 + " ms");
    }

}