package com.calmsir.java8fti.chapter1;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;

public class Question3 {

    private static Collection<File> getAllFilesWithExtension(final File directory, final String extension) {
        // extension is captured variable in lambda
        return Arrays.asList(directory.listFiles((file, name) -> name.endsWith(extension)));
    }

    public static void main(String[] args) {
        final File projectRoot = new File("./");
        final String fileExtension = ".xml";

        getAllFilesWithExtension(projectRoot, fileExtension).forEach(System.out::println);
    }
}
