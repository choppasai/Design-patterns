package Prototype.Configuration_Object_Cloning;

import static Prototype.Configuration_Object_Cloning.ConfigurationType.BASIC;

public class Client {
    public static void main(String[] args) {

        Configuration basic = new Configuration("dark theme",true,"English",
                false,2,"Normal", BASIC);
        NewConfiguration newConfiguration = new  NewConfiguration(basic);
        newConfiguration.setConfigId(123);
        newConfiguration.setConfigName("sai");
        newConfiguration.setConfigValue("basic default");
        PrototypeRegistryImpl impl = new PrototypeRegistryImpl();
        impl.addPrototype(basic);
//        System.out.println(impl.getPrototype(BASIC).getFontSize());
        Configuration c2 = impl.getPrototype(BASIC);
        c2 = c2.cloneObject();
        c2.setConfigId(111);
        c2.setConfigName("basic");
        c2.setConfigValue("basic default value");
        System.out.println(c2.getConfigId()+" "+ c2.getFontSize()+" "+ basic.getFontSize());

    }
}
