package com.examle.leetcodeproblems.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Number: 2491
Difficulty: Medium
*/

public class DividePlayersIntoTeamsOfEqualSkill {
    public static long dividePlayers(int[] skill) {
        int length = skill.length;
        int teamSkill = Arrays.stream(skill).sum() / (length / 2);
        long answer = 0;
        Map<Integer, Integer> count = new HashMap<>();

        for (int s : skill)
            count.merge(s, 1, Integer::sum);

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int skillEntry = entry.getKey();
            int frequency = entry.getValue();
            int requiredSkill = teamSkill - skillEntry;

            if (count.getOrDefault(requiredSkill, 0) != frequency)
                return -1;

            answer += (long) skillEntry * requiredSkill * frequency;
        }

        return answer / 2;
    }
}
