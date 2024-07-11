package Adaptor.SocialMediaAggregate;

public class SocialMediaPost {
    private String id;
    private String status;
    private Long userId;
    private Long timestamp;

    public SocialMediaPost(String id,String status,Long userId,Long timestamp){
        this.id = id;
        this.status = status;
        this.userId = userId;
        this.timestamp = timestamp;
    }
}
