import java.io.Serializable;

import static java.util.Calendar.getInstance;

public class ConfigSingleton implements Serializable {
    private static boolean created = false;

    private ConfigSingleton(){
        if (created){
            throw new RuntimeException("Singleton уже есть");
        }
        created = true;
        System.out.println("ConfigSingleton создан");
    }

    private static class Holder{
        static ConfigSingleton INSTANCE =new ConfigSingleton();}

    public static ConfigSingleton getInstance(){
        return Holder.INSTANCE;
    }
    private Object readResolve() {
        return getInstance();
    }

    private String configValue = "default";

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }
}
