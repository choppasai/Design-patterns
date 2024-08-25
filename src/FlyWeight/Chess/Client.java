package FlyWeight.Chess;

public class Client {
    public static void main(String[] args){
        Byte[] image = {0,1,0};

        UserIntrinsicState userIntrinsicState = new UserIntrinsicState("sai",24,"male",
                "sai@gmail.com","49079088",image);
        UserExtrinsicState userExtrinsicState = new UserExtrinsicState(Colour.BLACK,30,userIntrinsicState);
        FlyWeight flyWeight = new FlyWeight();
        flyWeight.addFlyweight(userIntrinsicState);
        System.out.println(flyWeight.registry.size() );
        UserExtrinsicState userExtrinsicState2 = null;
        UserIntrinsicState s = flyWeight.getFlyweight("sai@gmail.com");
        if(s != null){
            userExtrinsicState2 = new UserExtrinsicState(Colour.WHITE,20,s);
            System.out.println(userExtrinsicState2.getUser().getEmail());

        }
        else{
            System.out.println("unexpected result");
        }

    }
}
