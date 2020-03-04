package com.gconn.list.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Avezou Petit-Frere
 *
 * Missing list utilities
 */
public class ListUtil {

    /**
     * Given two lists return a list containing the elements that are only in one list.
     * Essentially the union minus the intersection. In other works (list1 - list2) U (list2 - list1)
     *
     * I opt to use a verbose implementation for clarity.
     *
     * @param list1 a list
     * @param list2 another list
     * @param <E> Generics
     * @return list of elements in list1 and not in list2 and vice versa
     */
    public static <E> List<E> getListDiff(List<E> list1, List<E> list2) {
        if (list1 == null || list1.isEmpty()) {
            return list2 == null || list2.isEmpty() ? null : list2;
        }

        if (list2 == null || list2.isEmpty()) {
            return list1 == null || list1.isEmpty() ? null : list1;
        }

        Set<E> diffSet = new HashSet<>(list1);
        Set<E> setOfCommonElements = new HashSet<>(list2);

        diffSet.addAll(list2);

        setOfCommonElements.retainAll(list1);

        diffSet.removeAll(setOfCommonElements);

        return new ArrayList<>(diffSet);
    }
}