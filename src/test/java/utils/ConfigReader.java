package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    public static void loadProperties() {
        try {
            properties = new Properties();
            FileInputStream fs = new FileInputStream("src/test/resources/config.properties");
            properties.load(fs);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String key){
        if(properties==null){
            loadProperties();
        }
        return properties.getProperty(key);
    }


}
