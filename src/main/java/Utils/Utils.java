package Utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utils {
    public static String getArtifactId(){

        Properties prop = new Properties();
        try (InputStream stream = ClassLoader.getSystemResourceAsStream("project.properties")){
            prop.load(stream);
            return prop.getProperty("artifactId", "artifactId not found");
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return "artifactId not found";
    }
}
