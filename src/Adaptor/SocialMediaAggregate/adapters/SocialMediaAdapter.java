package Adaptor.SocialMediaAggregate.adapters;

import Adaptor.SocialMediaAggregate.SocialMediaPost;

import java.util.List;

public interface SocialMediaAdapter {
    List<SocialMediaPost> getPost(Long userId, Long timeStamp);
    void getStatus(Long userId,String status);
}
