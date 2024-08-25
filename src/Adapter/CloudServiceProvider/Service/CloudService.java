package Adapter.CloudServiceProvider.Service;

import Adapter.CloudServiceProvider.Exception.UserNotFoundException;
import Adapter.CloudServiceProvider.Model.Connection;

public interface CloudService {
    Connection createConnection(Long userId) throws UserNotFoundException;
}
