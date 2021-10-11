package week_4.util;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class PropertyManager {

    String PATH;
    PropertiesConfiguration properties;

    public PropertyManager(String PATH) {
        try {
            this.properties = new PropertiesConfiguration(PATH);
        }catch (Exception e){
            e.printStackTrace();
        }
        this.PATH = PATH;
    }

    public String getProperty(String key){
        return this.properties.getProperty(key).toString();
    }

    public void updateProperty(String key, String value){
        try {
            this.properties.setProperty(key, value);
            this.properties.save();
        }catch (ConfigurationException e){
            e.printStackTrace();
        }
    }

}
