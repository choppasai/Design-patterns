package Adapter.SocialMediaAggregate.adapters;

import Adapter.SocialMediaAggregate.SocialMediaPost;

import java.util.List;

public interface SocialMediaAdapter {
    List<SocialMediaPost> getPost(Long userId, Long timeStamp);
    void getStatus(Long userId,String status);
}
