package Adaptor.SocialMediaAggregate.adapters;

import Adaptor.SocialMediaAggregate.SocialMediaPost;
import Adaptor.SocialMediaAggregate.external.FacebookApi;
import Adaptor.SocialMediaAggregate.external.FacebookPost;

import java.util.List;

public class FacebookAdapter implements SocialMediaAdapter{

    private FacebookApi facebookApi;
    public FacebookAdapter(){
        init();
    }

    public void init(){
        facebookApi = new FacebookApi();
        System.out.println("this in face init");
    }
    @Override
    public List<SocialMediaPost> getPost(Long userId, Long timeStamp) {

        return facebookApi.fetchFacebookPosts(userId,timeStamp).stream().map(FacebookAdapter::to).toList();
    }

    public static SocialMediaPost to(FacebookPost post){
        return  new SocialMediaPost(post.getId(), post.getStatus(),post.getTimestamp());
    }
    @Override
    public void getStatus(Long userId, String status) {
        facebookApi.postFacebookStatus(userId,status);
    }
}
