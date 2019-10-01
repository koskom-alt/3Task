package com.koskom.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utils {
    public static String getArtifactId(){

        Properties prop = new Properties();
        try (InputStream stream = ClassLoader.getSystemResourceAsStream("project.properties")) {

            prop.load(stream);

            String result = String.format("Hi: name %s artifactId %s"
                    , prop.getProperty("name", "name not found")
                    , prop.getProperty("artifactId", "artifactId not found"));

            return result;

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return "artifactId not found";

    }
}
