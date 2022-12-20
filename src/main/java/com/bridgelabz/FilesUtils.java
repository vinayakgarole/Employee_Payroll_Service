package com.bridgelabz;

import java.io.File;

public class FilesUtils {

    /*
     * Creating a boolean type method name as deleteFiles, its output is true or false type
     * ContentToDelete in file
     * Return delete content
     */
    public static boolean deleteFiles(File contentToDelete) {
        File[] allData = contentToDelete.listFiles();//using variable call listFiles method that will be store in allData variable
        if (allData != null) {
            for (File file : allData) {//iterate for each loop over addData
                deleteFiles(file);//calling method
            }
        }
        return contentToDelete.delete();
    }
}