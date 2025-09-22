import java.util.*;

public class Q6_UnionIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5};
        int[] arr2 = {2, 3, 5, 6};

        Set<Integer> union = new TreeSet<>();
        Set<Integer> intersection = new TreeSet<>();

        for (int x : arr1) union.add(x);
        for (int x : arr2) {
            if (union.contains(x)) intersection.add(x);
            union.add(x);
        }

        System.out.println("Union = " + union);
        System.out.println("Intersection = " + intersection);
    }
}
