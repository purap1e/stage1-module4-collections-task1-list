package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        if (Math.abs(num1) == num2) {
            return -1;
        } else if (num1 == Math.abs(num2)) {
            return 1;
        }
        return (int) ((5 * Math.pow(num1,2) + 3) - (5 * Math.pow(num2,2) + 3));
    }
}
