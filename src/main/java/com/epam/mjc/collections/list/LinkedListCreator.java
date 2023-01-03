package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> res = new LinkedList<>();
        for (Integer i : sourceList) {
            if ((i%2) == 0) {
                res.add(i);
            } else {
                res.add(0, i);
            }
        }
        return res;
    }
}
