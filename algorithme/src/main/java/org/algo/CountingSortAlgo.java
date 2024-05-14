package org.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountingSortAlgo
{
    public CountingSortAlgo() {
    }
    public List<Integer> countingSort(List<Integer> arr) {

        List<Integer> arr1 = new ArrayList<>(Collections.nCopies(100, 0));

        for (int number : arr) {
            arr1.set(number, arr1.get(number) + 1);
        }

        return arr1;
    }
}
