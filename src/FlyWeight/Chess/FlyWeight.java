package FlyWeight.Chess;


import java.util.HashMap;
import java.util.Map;

public class FlyWeight implements FlyweightRegistry{
    public Map<String,UserIntrinsicState> registry = new HashMap<>();
    @Override
    public void addFlyweight(UserIntrinsicState flyweight) {
        registry.put(flyweight.getEmail(),flyweight);
    }

    @Override
    public UserIntrinsicState getFlyweight(String email) {

        return registry.getOrDefault(email, null);
    }
}
