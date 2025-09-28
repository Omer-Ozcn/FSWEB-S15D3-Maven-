package org.example;

import org.example.entity.Employee;

import java.util.*;

public class Main {

    public static List<Employee> findDuplicates(List<Employee> list) {
        List<Employee> duplicates = new ArrayList<>();
        if (list == null) return duplicates;

        Set<Integer> seenIds = new HashSet<>();
        for (Employee e : list) {
            if (e == null || e.getId() == null) continue;
            if (!seenIds.add(e.getId())) {
                duplicates.add(e);
            }
        }
        return duplicates;
    }

    public static Map<Integer, Employee> findUniques(List<Employee> list) {
        Map<Integer, Employee> map = new HashMap<>();
        if (list == null) return map;

        for (Employee e : list) {
            if (e == null || e.getId() == null) continue;
            map.putIfAbsent(e.getId(), e);
        }
        return map;
    }


    public static List<Employee> removeDuplicates(List<Employee> list) {
        List<Employee> result = new ArrayList<>();
        if (list == null) return result;

        Map<Integer, Integer> counts = new HashMap<>();
        for (Employee e : list) {
            if (e == null || e.getId() == null) continue;
            counts.put(e.getId(), counts.getOrDefault(e.getId(), 0) + 1);
        }

        for (Employee e : list) {
            if (e == null || e.getId() == null) continue;
            if (counts.get(e.getId()) == 1) {
                result.add(e);
            }
        }
        return result;
    }
}
