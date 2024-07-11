package Adaptor.SocialMediaAggregate.external;

public class TwitterTweet {
    private String id;
    private String tweet;
    private Long userId;

    public TwitterTweet(String id, String tweet, long userId) {
        this.id = id;
        this.tweet = tweet;
        this.userId = userId;
    }
}
