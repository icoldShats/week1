public enum ConfigEnumSingleton {
    INSTANCE;
    private String configValue = "default";
    public String getConfigValue() {
        return configValue;
    }
    public String setConfigValue(){return configValue; }
    public void setConfigValue(String configValue){
        this.configValue=configValue;
    }

}
