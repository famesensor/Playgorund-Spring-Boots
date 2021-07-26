package com.example.spring.basics.springin5step;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    // public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
    // this.sortAlgorithm = sortAlgorithm;
    // }

    // public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
    // this.sortAlgorithm = sortAlgorithm;
    // }

    public int binarySearch(int[] number, int numberToSearchFor) {
        // sort
        int[] sortNumbers = sortAlgorithm.sort(number);

        // print sort logic
        System.out.println(sortAlgorithm);

        // logic binary search

        return 4;
    }
}
