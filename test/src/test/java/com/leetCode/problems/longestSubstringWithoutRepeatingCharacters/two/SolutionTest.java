package com.leetCode.problems.longestSubstringWithoutRepeatingCharacters.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        List<String> events = new ArrayList<>();
        events.add("Day, 1");
        events.add("BSA, 10");
        events.add("Drug2, 10");
        events.add("Drug4, 10");
        events.add("Day, 2");
        events.add("Drug1, 10");
        events.add("Drug4, 10");

        List<String> drugInfos = new ArrayList<>();
        drugInfos.add("Drug1, 100, 500, Drug2, Drug5");
        drugInfos.add("Drug2, 50, 500, Drug1, Drug3");
        drugInfos.add("Drug3, 80, 600, Drug2, Drug4");
        drugInfos.add("Drug4, 70, 300, Drug3, Drug5");
        drugInfos.add("Drug5, 60, 400, Drug4, Drug1");

        String solution = solution(events, drugInfos);
    }

    /*
    *
    *
    *
    * 29
Day, 1
BSA, 10
Drug2, 10
Drug4, 10
Day, 2
Drug1, 10
Drug3, 10
Day, 3
Drug1, 10
Drug4, 10
Day, 4
Drug2, 10
Drug4, 10
Day, 5
Drug3, 10
Drug5, 10
Day, 6
Drug5, 10
Drug3, 10
Drug1, 10
Drug4, 10
Drug2, 10
Day, 7
Drug5, 10
Drug4, 10
Drug2, 10
Day, 8
Drug3, 10
Drug2, 10
5
Drug1, 100, 500, Drug2, Drug5
Drug2, 50, 500, Drug1, Drug3
Drug3, 80, 600, Drug2, Drug4
Drug4, 70, 300, Drug3, Drug5
Drug5, 60, 400, Drug4, Drug1
    *
    * */

    public static String solution(List<String> events, List<String> drugInfos) {
        Map<String, List<String>> drugInfoMap = drugInfos.stream().map(e -> e.split(", "))
                .collect(Collectors.toMap(k -> k[0], v -> Arrays.stream(v).skip(0).toList()));

        List<Integer> daysIndexes = new ArrayList<>();
        double BSA = 1.0;
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).startsWith("Day")) {
                daysIndexes.add(i);
            }
        }

        for (int i = 0; i < daysIndexes.size(); i++) {
            Integer currentDayIndex = daysIndexes.get(i);
            String[] dayInfo = events.get(currentDayIndex).split(", ");

            boolean bsa = events.get(currentDayIndex + 1).startsWith("BSA");
            if (bsa) {
                String[] bsaInfo = events.get(currentDayIndex + 1).split(", ");
                BSA = Double.parseDouble(bsaInfo[1]);
            }

            List<String> activeEvents =
                    i == daysIndexes.size() - 1 ? events.subList(currentDayIndex, events.size()) : events.subList(currentDayIndex, daysIndexes.get(i + 1));
            Map<String, Integer> takenDozes = new HashMap<>();

            for (int j = bsa ? 1 : 0; j < activeEvents.size(); j++) {
                String[] event = activeEvents.get(j).split(", ");


            }

        }

        return null;
    }
}
