package com.sample.dstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringBlankSupperss {
    public static void main(String[] args) {
        String before = "abc defg xyz";

        String ss =
                before.chars()
                        .mapToObj(e -> (char) e)
                        .filter(character -> character != ' ')
                        .collect(Collectors.toList())
                        .stream().map(e -> e.toString()).reduce((accStr, s) -> accStr + s).get();

        System.out.println(ss);

    }
}
