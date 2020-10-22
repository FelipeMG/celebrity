package com.felipemg.celebrity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Celebrity {

    static Map<String, List<Integer>> people;

    public static Map<String, List<Integer>> initializePeople(int N, int[][] peopleInParty) {

        Map<String, List<Integer>> people = new HashMap<String, List<Integer>>();
        for (int person = 0; person < N; person++) {
            List<Integer> knownPeople = new ArrayList<Integer>();
            for (int knownPerson = 0; knownPerson < N; knownPerson++) {
                if (peopleInParty[person][knownPerson] == 1) {
                    knownPeople.add(knownPerson);
                }
            }
            people.put(String.valueOf(person), knownPeople);
        }
        return people;
    }

    public static int findCelebrity(int N, int[][] matrix){
        people = initializePeople(N, matrix);
        int celebrity = -1;
        for (int person = 0; person < N; person++) {
            if(people.get(String.valueOf(person)).isEmpty()){
                if(isKnownByEverybody(N,person)){
                    celebrity = person;
                }
                break;
            }
        }
        return celebrity;
    }

    public static boolean isKnownByEverybody(int N, int celebrity) {
        boolean isKnown = true;
        for (int person = 0; person < N; person++) {
            if(person != celebrity) {
                if(!knows(person,celebrity)){
                    isKnown = false;
                    break;
                }
            }
        }
        return isKnown;
    }

    public static boolean knows(int personA, int personB) {
        return people.get(String.valueOf(personA)).contains(personB);
    }

}
