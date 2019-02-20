package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyDB {
    private Map<String, Integer> id = new HashMap<>();
    private Map<String, String> name = new HashMap<>();
    private Map<String, Integer> population = new HashMap<>();

    public List<Map> city = new ArrayList<>();

    public void addRecord(Integer r_id, String r_name, Integer r_population){
        id.put("id",r_id);
        name.put("name", r_name);
        population.put("population", r_population);

        city.add(id);
        city.add(name);
        city.add(population);
    }
    public String getRecord(){
        return "ID: " + city.get(0).get("id") + " | NAME: " + city.get(1).get("name") + " | POPULATION: " + city.get(2).get("population");
    }

}
