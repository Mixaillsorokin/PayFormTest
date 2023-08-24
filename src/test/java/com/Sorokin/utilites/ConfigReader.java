package com.Sorokin.utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static  Properties properties;

    static {
        try (FileInputStream fileInputSteam = new FileInputStream("config.properties")) {
            properties = new Properties();
            properties.load(fileInputSteam);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Unable to find config.properties");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

}
