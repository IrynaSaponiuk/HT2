package propertiesReader;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesReaderClass {

    public String getLogin() throws Exception{
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Админ\\HT_2\\src\\main\\resources\\testData.properties");
        Properties properties = new Properties();

        properties.load(fileInputStream);

        String login = properties.getProperty("username");

        return login;
    }

    public String getPassword() throws Exception{
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Админ\\HT_2\\src\\main\\resources\\testData.properties");
        Properties properties = new Properties();

        properties.load(fileInputStream);

        String password = properties.getProperty("password");

        return password;
    }
}
