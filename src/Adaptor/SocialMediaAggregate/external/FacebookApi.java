package Adaptor.SocialMediaAggregate.external;

import java.util.List;

import static Adaptor.SocialMediaAggregate.external.APIUtils.logFacebookGetPosts;
import static Adaptor.SocialMediaAggregate.external.APIUtils.logFacebookPostStatus;


public class FacebookApi {
    public List<FacebookPost> fetchFacebookPosts(Long userId, Long timestamp) {

        logFacebookGetPosts();
        return List.of(new FacebookPost("1", "Hello World", 1L, 123456789L));
    }

    public void postFacebookStatus(Long user, String status) {

        logFacebookPostStatus();
    }
}
