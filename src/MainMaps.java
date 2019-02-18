import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainMaps {
    public static void main(String[] args) {
        Map<String, String> codeToNames = new HashMap<>();
        codeToNames.put("00010101","kawa");
        codeToNames.put("00010100","kawa z mlekiem");
        codeToNames.put("00010100","kawa z mlekiem 2");

        Map<String, Double> codeToPrices = new HashMap<>();
        codeToPrices.put("00010101", 9.99);
        codeToPrices.put("00010100", 11.99);

        // zwrócenie wartości występujących w mapie
        System.out.println(codeToNames.values());
        // zwrócenie kluczy występujących w mapie
        System.out.println(codeToNames.keySet());
        // czy kod występuje w zbiorze kluczy
        Set<String> myKeys = codeToNames.keySet();
        System.out.println(myKeys.contains("00010100"));



    }
}
