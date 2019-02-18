import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Main m = new Main();
//        System.out.println(m.hashCode());
        // deklaracja listy
        List<String> names = new ArrayList<>();
        // dodanie elementu do listy
        names.add("Adam");
        names.add("Jan");
        names.add("Anna");
        names.add("Ala");
        names.add("Ola");
        // odczyt elementu z listy
        System.out.println(names.get(1));
        // modyfikacja elementu listy
        names.set(1,"Janusz");
        System.out.println(names);
        // usuwanie wartości
        names.remove("Janusz");
        System.out.println(names);
        // sprawdzanie wystąpienia wartości
        System.out.println(names.contains("Ola"));
        // wypisanie długości listy
        System.out.println(names.size());
        System.out.println(names.contains("Janusz"));
        // na jakim indeksie jest wartość
        names.remove("Anna");
        System.out.println("Indeks Oli: " + names.indexOf("Ola"));


        // Utworzenie obiektu listy z zainicjalizowanymi wartościami
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(numbers);



    }
}
