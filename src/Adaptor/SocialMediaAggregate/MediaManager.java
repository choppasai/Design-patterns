package Adaptor.SocialMediaAggregate;


import Adaptor.SocialMediaAggregate.adapters.FacebookAdapter;
import Adaptor.SocialMediaAggregate.adapters.SocialMediaAdapter;

public class MediaManager {
    public static void main(String[] args) {
        SocialMediaAdapter socialMediaAdapter = new
                FacebookAdapter();
        socialMediaAdapter.getPost(15354l,0l);
    }
}
