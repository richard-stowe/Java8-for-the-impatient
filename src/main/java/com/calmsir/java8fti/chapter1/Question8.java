package com.calmsir.java8fti.chapter1;

import java.util.ArrayList;
import java.util.List;

public class Question8 {
    public static void main(String[] args) {
        String[] names = { "Peter", "Paul", "Mary" };
        List<Runnable> runners = new ArrayList<>();

        for(String name : names) {
            runners.add(() -> System.out.println(name));
        }

        runners.forEach(Runnable::run);

        runners = new ArrayList<>();
        for(int i = 0; i < names.length; i++) {
            String name = names[i];
            runners.add(() -> System.out.println(name));
        }

        runners.forEach(Runnable::run);
    }
}
