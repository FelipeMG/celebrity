package com.felipemg.celebrity;

import java.util.List;
import java.util.Map;

public class Celebrity {

    static Map<String, List<Integer>> people;

    public static int findCelebrity(int N, int[][] matrix) {

        int celebrity = -1;
        int person = 0;
        for (; person < N; person++) {
            if (matrix[0][person] == 1) {
                if (isKnownByEverybody(N, matrix, person) && knowsNobody(N, matrix, person)) {
                    celebrity = person;
                    break;
                }
            }
        }
        if (person == N) {
            if (isKnownByEverybody(N, matrix, 0)) {
                celebrity = 0;
            }
        }
        return celebrity;
    }

    private static boolean isKnownByEverybody(int N, int[][] matrix, int person) {
        boolean isKnown = true;
        for (int guest = 0; guest < N; guest++) {
            if (guest != person && matrix[guest][person] == 0) {
                isKnown = false;
                break;
            }
        }
        return isKnown;
    }

    private static boolean knowsNobody(int N, int[][] matrix, int person) {
        boolean knowsNobody = true;
        for (int guest = 0; guest < N; guest++) {
            if (matrix[person][guest] == 1) {
                knowsNobody = false;
                break;
            }
        }
        return knowsNobody;
    }

    public static boolean knows(int personA, int personB) {
        return people.get(String.valueOf(personA)).contains(personB);
    }

}
