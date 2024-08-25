package Adapter.CloudServiceProvider.Service;

import Adapter.CloudServiceProvider.Adapters.AWSAdapter;
import Adapter.CloudServiceProvider.Adapters.CloudAdapter;
import Adapter.CloudServiceProvider.Exception.UserNotFoundException;
import Adapter.CloudServiceProvider.Model.Connection;
import Adapter.CloudServiceProvider.Model.User;
import Adapter.CloudServiceProvider.Repository.UserRepository;

import java.util.Optional;

public class CloudServiceImpl implements CloudService{
    private UserRepository userRepositoryImpl;
    private CloudAdapter cloudAdapter;
    public CloudServiceImpl(UserRepository userRepository,CloudAdapter cloudAdapter){
        this.userRepositoryImpl = userRepository;
        this.cloudAdapter = cloudAdapter;
    }

    @Override
    public Connection createConnection(Long userId) throws UserNotFoundException {
        Optional<User> user = userRepositoryImpl.findUserById(userId);
        if(!user.isPresent())
            throw new UserNotFoundException("User not found");

        Connection connection = cloudAdapter.createConnection(userId);
//        userRepositoryImpl.save(user);
        return connection;
    }

}
