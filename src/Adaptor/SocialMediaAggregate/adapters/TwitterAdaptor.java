package Adaptor.SocialMediaAggregate.adapters;

import external.TwitterApi;
import external.TwitterTweet;

import java.util.List;

public class TwitterAdaptor implements SocialMediaAdapter<TwitterTweet> {
    private TwitterApi twitterApi;
    public void init(){
        twitterApi = new TwitterApi();
    }
    @Override
    public List<TwitterTweet> getPost(Long userId,Long timeStamp) {
        return twitterApi.getTweets(userId);
    }

    @Override
    public void getStatus(Long userId, String status) {
        twitterApi.tweet(userId,status);
    }
}
