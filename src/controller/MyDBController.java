package controller;

import model.MyDB;

import java.util.ArrayList;
import java.util.List;

public class MyDBController {
    private List<MyDB> city_table = new ArrayList();

    public void addCity(Integer r_id, String r_name, Integer r_population){
        MyDB db = new MyDB();
        db.addRecord(r_id,r_name,r_population);
        System.out.println("REKORD DODANO");
        city_table.add(db);
    }
    public void getCityTable(){
        for(MyDB m : city_table){
            System.out.println(m.getRecord());
        }
    }
}
