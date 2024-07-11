package Adaptor.SocialMediaAggregate.external;

import java.util.List;

import static Adaptor.SocialMediaAggregate.external.APIUtils.logTwitterGetPosts;
import static Adaptor.SocialMediaAggregate.external.APIUtils.logTwitterPostStatus;

public class TwitterApi {
    public List<TwitterTweet> getTweets(Long userId) {

        logTwitterGetPosts();
        return List.of(new TwitterTweet("1", "Hello World", 1L));
    }

    public void tweet(Long userId, String text) {

        logTwitterPostStatus();
    }
}
