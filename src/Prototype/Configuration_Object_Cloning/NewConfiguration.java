package Prototype.Configuration_Object_Cloning;

public class NewConfiguration extends Configuration{
    private int configId;
    private String configName;
    private String configValue;
    private boolean isEnabled;

    public int getConfigId() {
        return configId;
    }

    public void setConfigId(int configId) {
        this.configId = configId;

    }

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;

    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public boolean getIsEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public NewConfiguration(Configuration configuration){
        super(configuration);
        configId = this.getConfigId();
        configValue = this.getConfigValue();
        configName = this.getConfigName();

    }
    @Override
    public Configuration clone(){
        return new NewConfiguration(this);
    }
}
