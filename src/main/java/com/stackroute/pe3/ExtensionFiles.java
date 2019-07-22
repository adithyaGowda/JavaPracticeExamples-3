package com.stackroute.pe3;

import java.io.File;
import java.io.FilenameFilter;

public class ExtensionFiles implements FilenameFilter {

    public static void main(String[] args) {

        File file = new File("/home/cgi/Downloads/random/");
        String fileName = "hello.txt";
        ExtensionFiles ef = new ExtensionFiles(".txt");
        Boolean x = ef.accept(file,fileName);

    }

    String fileExtension;

    public ExtensionFiles(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    @Override
    public boolean accept(File directory, String fileName) {
        return (fileName.endsWith(this.fileExtension));
    }



}
