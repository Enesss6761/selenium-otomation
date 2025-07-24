package utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class PropReader {
    private PropReader() {
    }
    public static  String getGlobalData(String key) throws IOException {
        Properties properties = new Properties();
        FileInputStream file = new FileInputStream("src/test/resources/globalData.properties");
        properties.load(file);
        String value = properties.getProperty(key);
        return new String(value.getBytes("ISO-8859-1"), "UTF-8");
    }
}
