package controller;

import model.MyDB;

import java.util.ArrayList;
import java.util.List;

public class MyDBController {
    // Lista miast -> obiektów klasy modelu MyDB
    private List<MyDB> city_table = new ArrayList();

    // metoda dodająca miasto do listy miast
    public void addCity(String r_name, Integer r_population){
        // Obiekt klasy kodelu MyBD -> daje dostęp do pól i metod kalsy MyDB
        MyDB db = new MyDB();
        // dodanie wartości do map
        db.addRecord(r_name,r_population);
        // zapisuje obiekt miasta z przypisanymi wartościami
        // dla wszystkich map
        city_table.add(db);
    }
    // odczytująca zawartość listy miast
    public void getCityTable(){
        for(MyDB m : city_table){
            // metoda z klasy modelu -> "toString"
            System.out.println(m.getRecord());
        }
    }
    // metoda usuwająca obiekt MyDB po numerze id
    public void deleteCity(int id_selected){
        for (int i = 0; i < city_table.size(); i++){
            if(city_table.get(i).getCityId() == id_selected){
                city_table.remove(city_table.get(i));
            }
        }
    }
}
