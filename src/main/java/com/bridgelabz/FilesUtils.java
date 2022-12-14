package com.bridgelabz;

import java.io.File;

public class FilesUtils {

    /*
     * Creating a boolean type method name as deleteFiles, its output is true or false type
     * ContentToDelete in file
     * Return delete content
     */
    public static boolean deleteFiles(File contentToDelete) {

        File[] allContents = contentToDelete.listFiles();

        if (allContents != null) {

            for (File eachFile : allContents) {
                deleteFiles(eachFile);
            }
        }
        return contentToDelete.delete();
    }
}