package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        BubbleController bc = new BubbleController(new ArrayList<>(Arrays.asList(1, 3, 4, 2, 7, 8, 9, 10, 21, 100, 55, 200)));
        System.out.println(bc.bubbleSort("ASC"));
//        System.out.println(bc.insert(123,"DESC"));

    }
}
