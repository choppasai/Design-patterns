package Adapter.CloudServiceProvider.Repository;

import Adapter.CloudServiceProvider.Model.User;

import java.util.Optional;

public interface UserRepository {
    User save(User user);

    Optional<User> findUserById(long userId);
}
