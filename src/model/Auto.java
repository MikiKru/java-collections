package model;

import java.util.HashMap;
import java.util.Map;
// JAVA BEANS
public class Auto {
    private int id;
    private String brand;
    private String model;
    private double price_basic;
    private Map<String,Double> equipments = new HashMap<>();
    // ------------------------------------------------------------------------
    public Auto(int id, String brand, String model, double price_basic) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price_basic = price_basic;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price_basic=" + price_basic +
                ", equipments=" + equipments +
                '}';
    }

    // tylko getter do ID
    public int getId() {
        return id;
    }
    // -------------------------------------------------------------------------
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice_basic() {
        return price_basic;
    }

    public void setPrice_basic(double price_basic) {
        this.price_basic = price_basic;
    }

    public Map<String, Double> getEquipments() {
        return equipments;
    }
    // zmiana w setterze!!!
    public void setEquipments(String key, Double value) {
        this.equipments.put(key, value);
    }
}
