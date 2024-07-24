package Adapter.SocialMediaAggregate.adapters;


import Adapter.SocialMediaAggregate.SocialMediaPost;
import Adapter.SocialMediaAggregate.external.TwitterApi;
import Adapter.SocialMediaAggregate.external.TwitterTweet;

import java.util.List;

public class TwitterAdaptor implements SocialMediaAdapter {
    private TwitterApi twitterApi;
    public TwitterAdaptor(){
        init();
    }
    public void init(){
        twitterApi = new TwitterApi();
    }
    @Override
    public List<SocialMediaPost> getPost(Long userId, Long timeStamp) {
        return twitterApi.getTweets(userId).stream().map(TwitterAdaptor::to).toList();
    }

    public static SocialMediaPost to(TwitterTweet tweet){
        return new SocialMediaPost(tweet.getId(),tweet.getTweet(), tweet.getUserId());
    }

    @Override
    public void getStatus(Long userId, String status) {
        twitterApi.tweet(userId,status);
    }
}
