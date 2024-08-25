package Adapter.CloudServiceProvider.Adapters;

import Adapter.CloudServiceProvider.Libraries.AWS.AWSApi;
import Adapter.CloudServiceProvider.Libraries.AWS.AWSConnectionResponse;
import Adapter.CloudServiceProvider.Model.Connection;
import Adapter.CloudServiceProvider.Model.ConnectionStatus;

public class AWSAdapter implements CloudAdapter{
    private AWSApi AWSApi;
    public AWSAdapter(AWSApi AWSApi){
        this.AWSApi = AWSApi;
    }
    @Override
    public Connection createConnection(long userId) {
        AWSConnectionResponse awsConnectionResponse = AWSApi.createConnection(userId);
        Connection connection = new Connection();
        connection.setConnectionId(awsConnectionResponse.getConnectionId());
        String connectionStatus = awsConnectionResponse.getConnectionStatus();
        switch (connectionStatus){
            case "SUCCESS":
                connection.setConnectionStatus(ConnectionStatus.SUCCESS);
            case "FAILURE":
                connection.setConnectionStatus(ConnectionStatus.FAILURE);
        }
        return connection;
    }
}
