package controller;

import model.Auto;

import java.util.ArrayList;
import java.util.List;

public class AutoFactory {
    private List<Auto> autos = new ArrayList<>();
    private static int id = 1;

    public void addAuto(String brand, String model, double price_basic){
        Auto a = new Auto(id, brand, model, price_basic);
        autos.add(a);
        id++;
    }
    public void getAllAutos(){
        for ( Auto a : autos ){
            System.out.println(a);
        }
    }
    public void addEqipment(int id_selected, String eq_name, double eq_price){
        if(searchById(id_selected) != null){
            searchById(id_selected).setEquipments(eq_name,eq_price);
            System.out.println("Dodano wyposażenie ponadstandardowe");
        } else {
            System.out.println("Nie znaleziono auta o id=" + id_selected);
        }
    }
    public Auto searchById(int id_selected){
        for(Auto a : autos){
            if(a.getId() == id_selected){
                return a;
            }
        }
        return null;
    }




    public List<Auto> getAutosList(){
        return autos;
    }
}
