package com.sise.组合模式;

import java.io.File;

/**
 * The type Test.
 * @author lenm
 */
public class Test {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        FileParent textFile, videoFile, filesCleaner;
        textFile = new TextFile("文本文件");
        videoFile = new VideoFile("视频文件");
        filesCleaner = new Files();
        filesCleaner.add(textFile).add(videoFile).clearFile();
    }

    /**
     * Read file.
     *
     * @param fileName the file name
     */
    public void readFile(String fileName) {
        File file = new File(fileName);
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                System.out.println(file1.getAbsolutePath());
            }
            if (file1.isDirectory()) {
                System.out.println(file1.getAbsolutePath());
                readFile(file1.getAbsolutePath());
            }
        }
    }
}
