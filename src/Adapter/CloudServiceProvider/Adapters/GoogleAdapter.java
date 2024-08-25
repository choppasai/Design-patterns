package Adapter.CloudServiceProvider.Adapters;

import Adapter.CloudServiceProvider.Libraries.Google.GoogleApi;
import Adapter.CloudServiceProvider.Libraries.Google.GoogleConnectionResponse;
import Adapter.CloudServiceProvider.Model.Connection;
import Adapter.CloudServiceProvider.Model.ConnectionStatus;

public class GoogleAdapter implements CloudAdapter{
    private GoogleApi googleApi;
    public GoogleAdapter(GoogleApi googleApi){
        this.googleApi = googleApi;
    }
    @Override
    public Connection createConnection(long userId) {
        GoogleConnectionResponse googleConnectionResponse = googleApi.createConnection(userId);
        Connection connection = new Connection();
        connection.setConnectionId(googleConnectionResponse.getConnectionId());
        String connectionStatus = googleConnectionResponse.getConnectionStatus();
        switch(connectionStatus){
            case "SUCCESS":
                connection.setConnectionStatus(ConnectionStatus.SUCCESS);
            case "FAILURE":
                connection.setConnectionStatus(ConnectionStatus.FAILURE);
        }

        return connection;
    }
}
