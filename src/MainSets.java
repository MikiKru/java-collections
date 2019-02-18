import model.Box;

import java.util.HashSet;
import java.util.Set;

public class MainSets {
    public static void main(String[] args) {
//        Set<String> pesels = new HashSet<>();
////        // dodawanie wartości do zbioru
////        System.out.println(pesels.add("1234567789"));
////        System.out.println(pesels.add("1234567789"));
////        System.out.println(pesels.add("1234567733"));
////        System.out.println(pesels.add("4332567733"));
////        System.out.println(pesels.add("1233567733"));
////        System.out.println(pesels);
////        // sprawdzenie przynależności do zbioru
////        System.out.println("Czy jest pesel 1234567733: " + pesels.contains("1234567733"));
////        System.out.println("Czy jest pesel 234567733: " + pesels.contains("234567733"));
////        // usuwanie wartości
////        pesels.remove("1234567733");
////        System.out.println(pesels);
////        System.out.println(pesels.size());

    Set<Box> boxes1 = new HashSet<>();
    Box box = new Box(0,0,0);
    boxes1.add(new Box(1,2,3));
    boxes1.add(new Box(3,3,3));
    boxes1.add(new Box(1,2,3));
    boxes1.add(box);

    Set<Box> boxes2 = new HashSet<>();
    boxes2.add(new Box(1,2,3));
    boxes2.add(new Box(2,2,3));
    boxes2.add(new Box(3,2,3));
    boxes2.add(box);
//    boxes1.addAll(boxes2);
    boxes1.retainAll(boxes2);
    System.out.println(boxes1);
    System.out.println(boxes1.size());







    }
}
