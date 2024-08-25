package Builder.DataBaseConfiguration;

public class Client {
    public static void main(String[] args) {
        DatabaseConfigurationBuilder configurationBuilder =  DatabaseConfigurationBuilder.getBuilder()
                .setDatabaseUrl("http://.www.google.com").setPassword("sai")
                .setEnableCache(true).setMaxConnections(10)
                .setReadOnly(true).setUsername("sai").build();
        System.out.println(configurationBuilder.getDatabaseUrl() +" "+ configurationBuilder.getUsername());
    }
}
