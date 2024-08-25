package Adapter.CloudServiceProvider.Controller;

import Adapter.CloudServiceProvider.Exception.UserNotFoundException;
import Adapter.CloudServiceProvider.Model.Connection;
import Adapter.CloudServiceProvider.Service.CloudService;
import Adapter.CloudServiceProvider.dtos.CreateConnectionRequestDto;
import Adapter.CloudServiceProvider.dtos.CreateConnectionResponseDto;

public class CloudController {
    private CloudService cloudService;

    public CloudController(CloudService cloudService) {
        this.cloudService = cloudService;
    }

    public CreateConnectionResponseDto createConnection(CreateConnectionRequestDto createConnectionRequestDto) {

        Connection connection = null;
        try{
            connection = cloudService.createConnection(createConnectionRequestDto.getUserId());
            CreateConnectionResponseDto createConnectionResponseDto = new CreateConnectionResponseDto();
            createConnectionResponseDto.setConnectionId(connection.getConnectionId());
            createConnectionResponseDto.setConnectionStatus(connection.getConnectionStatus());

        }
        catch(UserNotFoundException e){
            System.out.println(e.getMessage());
        }

        return null;
    }
}
