package Adapter.CloudServiceProvider;

import Adapter.CloudServiceProvider.Adapters.AWSAdapter;
import Adapter.CloudServiceProvider.Adapters.CloudAdapter;
import Adapter.CloudServiceProvider.Controller.CloudController;
import Adapter.CloudServiceProvider.Libraries.AWS.AWSApi;
import Adapter.CloudServiceProvider.Repository.UserRepository;
import Adapter.CloudServiceProvider.Repository.UserRepositoryImpl;
import Adapter.CloudServiceProvider.Service.CloudService;
import Adapter.CloudServiceProvider.Service.CloudServiceImpl;

public class Client {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepositoryImpl();
        AWSApi awsApi = new AWSApi();
        CloudAdapter cloudAdapter = new AWSAdapter(awsApi);
        CloudService cloudService = new CloudServiceImpl(userRepository,cloudAdapter);

        CloudController cloudController = new CloudController(cloudService);
//        cloudController.createConnection();
    }
}
