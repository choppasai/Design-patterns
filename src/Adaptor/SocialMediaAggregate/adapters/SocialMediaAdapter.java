package Adaptor.SocialMediaAggregate.adapters;

import java.util.List;

public interface SocialMediaAdapter<T> {
    List<T> getPost(Long userId,Long timeStamp);
    void getStatus(Long userId,String status);
}
