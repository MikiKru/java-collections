import controller.BubbleController;
import controller.HeapController;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortingTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 100000; i++){
            list.add(rnd.nextInt(100));
        }
        // ----BUBBLE SORTING ------------------------------------------------------------------
        BubbleController bc = new BubbleController(list);
        LocalTime t_start = LocalTime.now();
        System.out.println(bc.bubbleSort("DESC"));
        LocalTime t_stop = LocalTime.now();
        System.out.println("Czas sortowania BubbleSorting: " + Duration.between(t_start,t_stop));
        // ----HEAP SORTING ------------------------------------------------------------------
        HeapController hp = new HeapController();
        t_start = LocalTime.now();
        hp.heapSorting(list,"DESC");
        t_stop = LocalTime.now();
        System.out.println("Czas sortowania HeapSorting: " + Duration.between(t_start,t_stop));
    }
}
