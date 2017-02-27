package com.calmsir.java8fti.chapter1;

import java.io.File;
import java.util.Arrays;

public class Question4 {
    private static void sortByTypeAndName(final File[] files) {
        Arrays.sort(files, (file1, file2) -> -Boolean.compare(file1.isDirectory(), file2.isDirectory()));
    }

    public static void main(String[] args) {
        final File[] files = new File(".").listFiles();
        sortByTypeAndName(files);

        Arrays.asList(files).forEach(System.out::println);
    }
}
