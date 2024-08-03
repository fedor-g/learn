package com.example;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        System.out.println(list.toString());


    }

    public static double calculateSubmissionsPerWeek(long submissionAmount) {
        long weeks = 13L;
        return weeks == 0 ? submissionAmount : (double)  submissionAmount / weeks;
    }
}
