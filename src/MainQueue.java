import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        // FI FO
        Queue<String> shopQueue = new ArrayDeque<>();
        shopQueue.add("Ania");
        shopQueue.add("Jan");
        shopQueue.add("Ala");
        shopQueue.add("Ela");
        shopQueue.add("Marek");

        System.out.println(shopQueue);
        System.out.println("Obsłużony: " + shopQueue.remove());
        System.out.println("Obsłużony: " + shopQueue.remove());
        System.out.println("Obsłużony: " + shopQueue.remove());
        System.out.println(shopQueue);
        // FI LO
        Deque <String> commits = new ArrayDeque<>();
        commits.add("C1");
        commits.add("C2");
        commits.add("C3");
        commits.add("C4");
        System.out.println(commits);
        commits.removeLast();




    }
}
