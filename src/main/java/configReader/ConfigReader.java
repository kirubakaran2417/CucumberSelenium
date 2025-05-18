package configReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class ConfigReader {

    public String getPropertyValue(String key) {
        Properties properties = new Properties();
        try {
            FileInputStream input = new FileInputStream("src/main/resources/config/config.properties");
            properties.load(input);
            return properties.getProperty(key);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }


}
