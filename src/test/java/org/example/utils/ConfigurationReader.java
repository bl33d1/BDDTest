package org.example.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

  private static Properties properties = new Properties();

  static {
    try{
      // open file with InputStream
      FileInputStream inputStream = new FileInputStream("configuration.properties");
      properties.load(inputStream);

      inputStream.close();
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static String getProperty(String key){
    return properties.getProperty(key);
  }
}
