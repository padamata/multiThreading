package com.siva.MultiThreading.sample;

import java.util.*;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("With out duplicates: " + seen);
        return duplicates;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4, 5, 5};
        System.out.println("Duplicates: " + findDuplicates(nums));
    }
}