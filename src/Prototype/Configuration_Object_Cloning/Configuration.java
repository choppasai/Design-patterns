package Prototype.Configuration_Object_Cloning;

public class Configuration implements ClonableObject<Configuration>{
    private String themeColor;
    private Boolean autoSave;
    private String language;
    private Boolean darkMode;
    private Integer fontSize;
    private String fontFamily;
    private ConfigurationType type;

    private Integer configId;
    private String configName;
    private String configValue;
    private Boolean isEnabled;

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

    public void setThemeColor(String themeColor) {
        this.themeColor = themeColor;
    }

    public void setAutoSave(Boolean autoSave) {
        this.autoSave = autoSave;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setDarkMode(Boolean darkMode) {
        this.darkMode = darkMode;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public void setType(ConfigurationType type) {
        this.type = type;
    }



    public Configuration(String themeColor, Boolean autoSave, String language, Boolean darkMode, Integer fontSize, String fontFamily, ConfigurationType type) {
        this.themeColor = themeColor;
        this.autoSave = autoSave;
        this.language = language;
        this.darkMode = darkMode;
        this.fontSize = fontSize;
        this.fontFamily = fontFamily;
        this.type = type;
    }

    public Configuration(Configuration configuration){
        this.themeColor = configuration.getThemeColor();
        this.autoSave = configuration.getAutoSave();
        this.language = configuration.getLanguage();
        this.darkMode = configuration.getDarkMode();
        this.fontSize = configuration.getFontSize();
        System.out.println("inside constructor " +this.getFontSize());
        this.fontFamily = configuration.getFontFamily();
        this.type = configuration.getType();

    }

    public String getThemeColor() {
        return themeColor;
    }

    public Boolean getAutoSave() {
        return autoSave;
    }

    public String getLanguage() {
        return language;
    }

    public Boolean getDarkMode() {
        return darkMode;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public ConfigurationType getType() {
        return type;
    }

    @Override
    public Configuration cloneObject() {

        return new Configuration(this);
    }
}
