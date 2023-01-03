package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        for (int i = 0; i < sourceList.size(); i++) {
            if (i == 0) {
                System.out.println();
                continue;
            }
            int item_abs = Math.abs(Integer.parseInt(sourceList.get(i)));
            int item = Integer.parseInt(sourceList.get(i));
            int j = i;
            while (j > 0) {
                int index_prev = j - 1;
                int item_prev_abs = Math.abs(Integer.parseInt(sourceList.get(index_prev)));
                int item_prev = Integer.parseInt(sourceList.get(index_prev));
                if (item_abs < item_prev_abs) {
                    sourceList.set(j, String.valueOf(item_prev));
                    sourceList.set(index_prev, String.valueOf(item));
                    j--;
                } else if (item_abs == item_prev_abs) {
                    if (item_prev > item) {
                        sourceList.set(index_prev, String.valueOf(item));
                        sourceList.set(j, String.valueOf(item_prev));
                    }
                    break;
                } else {
                    break;
                }
            }
        }
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
//        System.out.println("a=" + aInt + " b=" + bInt);
        return Integer.compare(aInt, bInt);
    }
}
