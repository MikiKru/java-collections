package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeapController {
    // ---------------ALGORYTM SORTOWANIA-----------------------------
    private List<Integer> sortedlist = new ArrayList<>();

    public void heapSorting(List<Integer> unsortedList){
        while(unsortedList.size() > 0) {
            // 1. Tworzymy kopiec
            unsortedList = buildHeap(unsortedList);
            // 2. Wycinamy wartość elementu o indeksie 0
            System.out.print(unsortedList.remove(0) + " ");
        }
    }
    // ---------------ALGORYTM KOPCA----------------------------------
    public List buildHeap(List<Integer> arr) {
        for (int i = (arr.size() - 1) / 2; i >= 0; i--) {
            buildMaxHeap(arr, i, arr.size() - 1);
        }
        return arr;
    }
    public void buildMaxHeap(List<Integer> arr, int i, int N) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int max = i;
        if (left <= N && arr.get(left) > arr.get(i)) max = left;
        if (right <= N && arr.get(right) > arr.get(max)) max = right;
        if (max != i) {
            swap(arr, i, max);
            buildMaxHeap(arr, max, N);
        }
    }
    public void swap(List<Integer> arr, int i, int max) {
        int tmp = arr.get(i);
        arr.set(i, arr.get(max));
        arr.set(max, tmp);
    }
    // -------------------------------------------------------------------
    public static void main(String[] args) {
        HeapController hc = new HeapController();
//        hc.buildHeap(new ArrayList<>());
        List<Integer> list = new ArrayList<>(Arrays.asList(5,2,6,5,7,1));
        hc.heapSorting(list);
    }
}
