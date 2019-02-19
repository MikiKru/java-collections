package controller;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetController {
    private Set<Integer> set1;
    private Set<Integer> set2;
    public SetController(Set<Integer> set1, Set<Integer> set2) {
        this.set1 = set1;
        this.set2 = set2;
    }
    public Set<Integer> sum(){
        set1.addAll(set2);
        return set1;
    }
    public Set<Integer> diff(){
        set1.removeAll(set2);
        return set1;
    }
    public Set<Integer> intersect(){
        set1.retainAll(set2);
        return set1;
    }
    public Set<Integer> symDiff(){
        // cześć wspólna będzie w intersect product
        Set<Integer> intersectProduct = new HashSet<>(set2);
        intersectProduct.retainAll(set1);
        // suma zbiorów będzie w set 1
        set1.addAll(set2);
        // różnica symatryczna będzie w set1
        set1.removeAll(intersectProduct);
        return set1;
    }
public static void main(String[] args) {
    SetController sc = new SetController(new HashSet<Integer>(Arrays.asList(1, 2, 3)), new HashSet<Integer>(Arrays.asList(2, 3, 4, 5)));
    System.out.println(sc.sum());
    SetController sc1 = new SetController(new HashSet<Integer>(Arrays.asList(1, 2, 3)), new HashSet<Integer>(Arrays.asList(2, 3, 4, 5)));
    System.out.println(sc1.diff());
    SetController sc2 = new SetController(new HashSet<Integer>(Arrays.asList(1, 2, 3)), new HashSet<Integer>(Arrays.asList(2, 3, 4, 5)));
    System.out.println(sc2.intersect());
    SetController sc3 = new SetController(new HashSet<Integer>(Arrays.asList(1, 2, 3)), new HashSet<Integer>(Arrays.asList(2, 3, 4, 5)));
    System.out.println(sc3.symDiff());

}

}
