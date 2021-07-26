package com.example.spring.basics.springin5step;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements  SortAlgorithm {
    public  int[] sort(int[] number) {

        return  number;
    }
}
