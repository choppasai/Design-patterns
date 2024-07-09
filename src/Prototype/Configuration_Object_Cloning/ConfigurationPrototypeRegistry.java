package Prototype.Configuration_Object_Cloning;

public interface ConfigurationPrototypeRegistry {
    void addPrototype(Configuration user);

    Configuration getPrototype(ConfigurationType type);

    Configuration clone(ConfigurationType type);
}
