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
        for(int i = 0; i < autos.size(); i++){
            if(autos.get(i).getId() == id_selected){
                autos.get(i).setEquipments(eq_name, eq_price);
                System.out.println("Dodano wyposażenie ponadstandardowe");
            }
        }
    }




    public List<Auto> getAutosList(){
        return autos;
    }
}
