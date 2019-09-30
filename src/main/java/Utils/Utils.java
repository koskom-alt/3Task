package Utils;

import java.io.IOException;
import java.util.Properties;

public class Utils {
    public static String getArtifactId(){

        Properties prop = new Properties();
        try {
            prop.load(ClassLoader.getSystemResourceAsStream("project.properties"));
            return prop.getProperty("artifactId");
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return "OMG";
    }
}
