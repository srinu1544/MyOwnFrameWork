package com.example.myownframework.KOTLIN_ANDROID.CollectionFrameWork.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;

public class Properties {
    public static void main(String[] args) throws IOException {

        File file = new File("dbconfig.properties");
        if (!file.exists())
            file.createNewFile();
        java.util.Properties properties = new java.util.Properties();
        properties.setProperty("name","srinivas");
        properties.setProperty("age","56");
        System.out.println(properties.getProperty("name"));
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        properties.store(fileOutputStream,"this is propeties file");
        Collection<Object> keys = properties.values();
        System.out.println(keys);

    }
}
