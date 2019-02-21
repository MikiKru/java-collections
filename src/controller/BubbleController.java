package controller;

import java.lang.reflect.Array;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BubbleController {
    List<Integer> list = new ArrayList<>();

    public BubbleController(List<Integer> list) {
        this.list = list;
    }

    public List bubbleSort(String type) {
        int counter = 0;
        // pętla iterująca po testach
        for (int j = 1; j < list.size(); j++) {
            counter = 0;
            // pętla iterująca po wartościach
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i - 1) < list.get(i) && type.toUpperCase().equals("DESC")) {
                    swap(i - 1, i);
                    counter++;
                }
                if (list.get(i - 1) > list.get(i) && type.toUpperCase().equals("ASC")) {
                    swap(i - 1, i);
                    counter++;
                }
            }
            System.out.println(j + " " + list);
            if(counter == 0){
                return list;
            }
        }
        return list;
    }
    public void swap(int i1, int i2) {
        int tmp = list.get(i1);
        list.set(i1, list.get(i2));
        list.set(i2, tmp);
    }
    public List insert(int newElement, String type){
        list.add(newElement);
        return bubbleSort(type);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 100000; i++){
            list.add(rnd.nextInt(100));
        }
        BubbleController bc = new BubbleController(list);
        // ---------------------------------------------------
        LocalTime t_start = LocalTime.now();
        System.out.println(bc.bubbleSort("DESC"));
        LocalTime t_stop = LocalTime.now();
        // ---------------------------------------------------
        // Duration -> klasa zawierająca metody do porównywania obiektów czasowych
        // Period -> klasa zawierająca metody do porównywania obiektów datowych
        System.out.println(Duration.between(t_start,t_stop));
//        System.out.println(bc.insert(123,"DESC"));

    }
}
