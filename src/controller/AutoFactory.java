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
    public List<Auto> getAutosList(){
        return autos;
    }
}
