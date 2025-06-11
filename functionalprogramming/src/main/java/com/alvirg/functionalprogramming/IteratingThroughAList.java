package com.alvirg.functionalprogramming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class IteratingThroughAList {
    public static void main(String[] args) {

        final List<String> friends = Arrays.asList(
                "Brian",
                "Nate",
                "Neal",
                "Raju",
                "Sara",
                "Scott");

        friends.forEach(System.out::println);
    }
}
