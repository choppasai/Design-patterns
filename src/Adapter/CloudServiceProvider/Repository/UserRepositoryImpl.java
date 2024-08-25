package Adapter.CloudServiceProvider.Repository;

import Adapter.CloudServiceProvider.Model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository{
    Map<Integer,User> map = new HashMap<>();
    @Override
    public User save(User user) {
        if(!map.containsKey(user.getId()))
            map.put((int)user.getId(),user);
        return null;
    }

    @Override
    public Optional<User> findUserById(long userId) {
        if(map.containsKey(userId))
            return Optional.ofNullable(map.get(userId));
        return Optional.empty();
    }
}
