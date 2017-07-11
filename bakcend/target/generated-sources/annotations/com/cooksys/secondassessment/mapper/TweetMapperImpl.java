package com.cooksys.secondassessment.mapper;

import com.cooksys.secondassessment.dto.TweetCreateSimpleDto;
import com.cooksys.secondassessment.dto.TweetSimpleDto;
import com.cooksys.secondassessment.dto.TweetWithIdDto;
import com.cooksys.secondassessment.entity.Tweet;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-07-10T21:12:46-0500",
    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
@Component
public class TweetMapperImpl implements TweetMapper {

    @Autowired
    private TweetUserMapper tweetUserMapper;

    @Override
    public TweetWithIdDto tWithIdDto(Tweet t) {
        if ( t == null ) {
            return null;
        }

        TweetWithIdDto tweetWithIdDto = new TweetWithIdDto();

        tweetWithIdDto.setId( t.getId() );
        tweetWithIdDto.setAuthor( tweetUserMapper.tweetUserDisplayNameDto( t.getAuthor() ) );
        tweetWithIdDto.setContent( t.getContent() );
        tweetWithIdDto.setPosted( t.getPosted() );

        return tweetWithIdDto;
    }

    @Override
    public Tweet toTweet(TweetWithIdDto t) {
        if ( t == null ) {
            return null;
        }

        Tweet tweet = new Tweet();

        tweet.setId( t.getId() );
        tweet.setPosted( t.getPosted() );
        tweet.setAuthor( tweetUserMapper.toTweetUser( t.getAuthor() ) );
        tweet.setContent( t.getContent() );

        return tweet;
    }

    @Override
    public TweetCreateSimpleDto tweetCreateSimpleDto(Tweet t) {
        if ( t == null ) {
            return null;
        }

        TweetCreateSimpleDto tweetCreateSimpleDto = new TweetCreateSimpleDto();

        tweetCreateSimpleDto.setContent( t.getContent() );

        return tweetCreateSimpleDto;
    }

    @Override
    public Tweet toTweet(TweetCreateSimpleDto t) {
        if ( t == null ) {
            return null;
        }

        Tweet tweet = new Tweet();

        tweet.setContent( t.getContent() );

        return tweet;
    }

    @Override
    public TweetSimpleDto tweetSimpleDto(Tweet t) {
        if ( t == null ) {
            return null;
        }

        TweetSimpleDto tweetSimpleDto = new TweetSimpleDto();

        tweetSimpleDto.setId( t.getId() );
        tweetSimpleDto.setContent( t.getContent() );
        tweetSimpleDto.setAuthor( tweetUserMapper.tweetUserDisplayNameDto( t.getAuthor() ) );
        tweetSimpleDto.setPosted( t.getPosted() );

        return tweetSimpleDto;
    }

    @Override
    public Tweet toTweet(TweetSimpleDto t) {
        if ( t == null ) {
            return null;
        }

        Tweet tweet = new Tweet();

        tweet.setId( t.getId() );
        tweet.setPosted( t.getPosted() );
        tweet.setAuthor( tweetUserMapper.toTweetUser( t.getAuthor() ) );
        tweet.setContent( t.getContent() );

        return tweet;
    }
}
