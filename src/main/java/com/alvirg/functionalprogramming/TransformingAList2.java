package com.alvirg.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class TransformingAList2 {
    public static void main(String[] args) {

        final List<String> friends = Arrays.asList(
                "Brian",
                "Nate",
                "Neal",
                "Raju",
                "Sara",
                "Scott",
                "Regina");


        friends.stream()
                .map(String::toUpperCase)
                .forEach(name->System.out.print(name + " "));
        System.out.println();

    }
}
