package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyDB {
    // statyczny nr do związany z klasą a nie z obiektem
    public static int id_global;
    private Map<String, Integer> id = new HashMap<>();
    private Map<String, String> name = new HashMap<>();
    private Map<String, Integer> population = new HashMap<>();

    public List<Map> city = new ArrayList<>();
    // metoda wpisująca wartości do map
    public void addRecord(String r_name, Integer r_population){
        id.put("id", ++id_global);
        name.put("name", r_name);
        population.put("population", r_population);
        // mapy są wpisywane do listy w celu ujenolicenia adresowania
        city.add(id);
        city.add(name);
        city.add(population);
    }
    // nasz toString klasy modelu MyDB
    public String getRecord(){
        return "ID: " + city.get(0).get("id") + " | NAME: " + city.get(1).get("name") + " | POPULATION: " + city.get(2).get("population");
    }
    // metoda zwracająca id miasta
    public int getCityId(){
        return id.get("id");
    }

}
