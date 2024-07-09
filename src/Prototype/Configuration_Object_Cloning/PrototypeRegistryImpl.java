package Prototype.Configuration_Object_Cloning;

import java.util.HashMap;

public class PrototypeRegistryImpl implements ConfigurationPrototypeRegistry{
    HashMap<ConfigurationType,Configuration> registry = new HashMap<ConfigurationType, Configuration>();

    Configuration configuration;
    @Override
    public void addPrototype(Configuration user) {
        if(!registry.containsKey(user.getType()))
            registry.put(user.getType(),user);
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        return registry.get(type);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        return registry.get(type).cloneObject();
//        switch(type){
//            case BASIC -> {
//                configuration = registry.get(ConfigurationType.BASIC);
//                return configuration.cloneObject();
//            }
//            case ADVANCED -> {
//                configuration = registry.get(ConfigurationType.ADVANCED);
//                return configuration.cloneObject();
//            }
//            case CUSTOM -> {
//                configuration = registry.get(ConfigurationType.CUSTOM);
//                return configuration.cloneObject();
//            }
//            default ->  {
//                configuration = registry.get(ConfigurationType.DEFAULT);
//                return configuration.cloneObject();
//            }
//        }
    }
}
