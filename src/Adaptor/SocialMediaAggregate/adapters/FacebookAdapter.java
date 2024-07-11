package Adaptor.SocialMediaAggregate.adapters;


import external.FacebookApi;
import external.FacebookPost;

import java.util.List;

public class FacebookAdapter implements SocialMediaAdapter<FacebookPost>{

    private FacebookApi facebookApi;
    public FacebookAdapter(){
//        init();
    }

    public void init(){
        facebookApi = new FacebookApi();
        System.out.println("this in face init");
    }
    @Override
    public List<FacebookPost> getPost(Long userId, Long timeStamp) {

        return facebookApi.fetchFacebookPosts(userId,timeStamp);
    }

    @Override
    public void getStatus(Long userId, String status) {
        facebookApi.postFacebookStatus(userId,status);
    }
}
