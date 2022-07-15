package commonLibs.utilities;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtils {
    public static String getConfigValue(String key) {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String configFilePath = currentWorkingDirectory + "/src/main/resources/config.properties";

        Properties prop = new Properties();
        InputStream inputStream = ConfigUtils.class.getClassLoader().getResourceAsStream(configFilePath);
        try {
            prop.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}