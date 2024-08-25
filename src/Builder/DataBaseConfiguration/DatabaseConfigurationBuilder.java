package Builder.DataBaseConfiguration;


public class DatabaseConfigurationBuilder {
    private String databaseUrl;
    private String username;
    private String password;
    private int maxConnections;
    private boolean enableCache;
    private boolean isReadOnly;

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public boolean isEnableCache() {
        return enableCache;
    }

    public boolean isReadOnly() {
        return isReadOnly;
    }

    public static Builder getBuilder(){
        return new Builder();
    }
    private DatabaseConfigurationBuilder(Builder builder){
        this.databaseUrl = builder.getDatabaseUrl();
        this.username = builder.getUsername();
        this.password = builder.getPassword();
        this.maxConnections = builder.getMaxConnections();
        this.enableCache = builder.isEnableCache();
        this.isReadOnly = builder.isReadOnly();
    }
    public static class Builder{
        private String databaseUrl;
        private String username;
        private String password;
        private int maxConnections;
        private boolean enableCache;
        private boolean isReadOnly;
        public String getDatabaseUrl() {
            return databaseUrl;
        }

        public DatabaseConfigurationBuilder.Builder setDatabaseUrl(String databaseUrl) {
            this.databaseUrl = databaseUrl;
            return this;
        }

        public String getUsername() {
            return username;
        }

        public DatabaseConfigurationBuilder.Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public DatabaseConfigurationBuilder.Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public int getMaxConnections() {
            return maxConnections;
        }

        public DatabaseConfigurationBuilder.Builder setMaxConnections(int maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }

        public boolean isEnableCache() {
            return enableCache;
        }

        public DatabaseConfigurationBuilder.Builder setEnableCache(boolean enableCache) {
            this.enableCache = enableCache;
            return this;
        }

        public boolean isReadOnly() {
            return isReadOnly;
        }

        public DatabaseConfigurationBuilder.Builder setReadOnly(boolean readOnly) {
            isReadOnly = readOnly;
            return this;
        }
        //    validation will done before object creation.
        public DatabaseConfigurationBuilder build(){
            return new DatabaseConfigurationBuilder(this);
        }

    }

}