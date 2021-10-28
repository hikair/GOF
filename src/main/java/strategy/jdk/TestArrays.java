package strategy.jdk;

import java.util.Arrays;
import java.util.Comparator;

public class TestArrays {

    public static void main(String[] args) {
        Integer[] arr = {3, 5, 4, 8, 2, 9, 1};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });
        System.out.println(Arrays.toString(arr));
    }

}
