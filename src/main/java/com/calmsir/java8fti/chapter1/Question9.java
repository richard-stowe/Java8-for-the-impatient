package com.calmsir.java8fti.chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Question9 {

    interface Collection2<T> extends Collection<T> {
        @SuppressWarnings("unchecked")
        default void forEachIf(Consumer<T> action, Predicate<T> filter) {
            forEach(item -> {
                if(filter.test(item)) {
                    action.accept(item);
                }
            });
        }
    }

    private static class MyArray<T> extends ArrayList<T> implements Collection2<T> { }

    public static void main(String[] args) {
        Collection2<String> myArray = new MyArray<>();
        myArray.addAll(Arrays.asList("Hello", "World"));
        myArray.forEachIf(System.out::println, (String string) -> string.contains("ello"));
    }
}
