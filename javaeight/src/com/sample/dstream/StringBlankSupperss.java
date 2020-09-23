package com.sample.dstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringBlankSupperss {
    public static void main(String[] args) {
        String before = "abc defg xyz";

        char[] ch = before.toCharArray();
        int len = before.length();
        char[] chr = new char[len];
        StringBuffer buffer = new StringBuffer();
        int i=0;
        for (int n = 0; n < len; n++){
            if (ch[n] != ' '){
                chr[i] = ch[n];
                buffer.append(chr[i]);
                i++;
            }
        }
        System.out.println("wo stream: " + buffer);

        String after =
                before.chars()
                        .mapToObj(e -> (char) e)
                        .filter(character -> character != ' ')
                        .collect(Collectors.toList())
                        .stream().map(e -> e.toString()).reduce((accStr, s) -> accStr + s).get();

        System.out.println("w/ stream: " + after);

    }
}
