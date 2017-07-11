package com.cooksys.secondassessment.mapper;

import com.cooksys.secondassessment.dto.TweetUserCreateDto;
import com.cooksys.secondassessment.dto.TweetUserCredOnlyDto;
import com.cooksys.secondassessment.dto.TweetUserDisplayNameDto;
import com.cooksys.secondassessment.dto.TweetUserDto;
import com.cooksys.secondassessment.entity.Credentials;
import com.cooksys.secondassessment.entity.TweetUser;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-07-10T21:12:47-0500",
    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
@Component
public class TweetUserMapperImpl implements TweetUserMapper {

    @Autowired
    private ProfileMapper profileMapper;

    @Override
    public TweetUserDto tUserDto(TweetUser t) {
        if ( t == null ) {
            return null;
        }

        TweetUserDto tweetUserDto = new TweetUserDto();

        tweetUserDto.setUsername( tCredentialsUsername( t ) );
        tweetUserDto.setProfile( profileMapper.tProfileDto( t.getProfile() ) );
        tweetUserDto.setJoined( t.getJoined() );

        return tweetUserDto;
    }

    @Override
    public TweetUser toTweetUser(TweetUserDto t) {
        if ( t == null ) {
            return null;
        }

        TweetUser tweetUser = new TweetUser();

        tweetUser.setProfile( profileMapper.toProfile( t.getProfile() ) );
        tweetUser.setJoined( t.getJoined() );

        return tweetUser;
    }

    @Override
    public TweetUser toTweetUser(TweetUserCreateDto t) {
        if ( t == null ) {
            return null;
        }

        TweetUser tweetUser = new TweetUser();

        tweetUser.setCredentials( t.getCredentials() );
        tweetUser.setProfile( profileMapper.toProfile( t.getProfile() ) );

        return tweetUser;
    }

    @Override
    public TweetUserCreateDto tCreateDto(TweetUser t) {
        if ( t == null ) {
            return null;
        }

        TweetUserCreateDto tweetUserCreateDto = new TweetUserCreateDto();

        tweetUserCreateDto.setCredentials( t.getCredentials() );
        tweetUserCreateDto.setProfile( profileMapper.tEmailOnlyDto( t.getProfile() ) );

        return tweetUserCreateDto;
    }

    @Override
    public TweetUserCredOnlyDto tweetUserCredOnlyDto(TweetUser t) {
        if ( t == null ) {
            return null;
        }

        TweetUserCredOnlyDto tweetUserCredOnlyDto = new TweetUserCredOnlyDto();

        tweetUserCredOnlyDto.setCredentials( t.getCredentials() );

        return tweetUserCredOnlyDto;
    }

    @Override
    public TweetUser toTweetUser(TweetUserCredOnlyDto t) {
        if ( t == null ) {
            return null;
        }

        TweetUser tweetUser = new TweetUser();

        tweetUser.setCredentials( t.getCredentials() );

        return tweetUser;
    }

    @Override
    public TweetUserDisplayNameDto tweetUserDisplayNameDto(TweetUser t) {
        if ( t == null ) {
            return null;
        }

        TweetUserDisplayNameDto tweetUserDisplayNameDto = new TweetUserDisplayNameDto();

        tweetUserDisplayNameDto.setUsername( tCredentialsUsername_( t ) );

        return tweetUserDisplayNameDto;
    }

    @Override
    public TweetUser toTweetUser(TweetUserDisplayNameDto t) {
        if ( t == null ) {
            return null;
        }

        TweetUser tweetUser = new TweetUser();

        return tweetUser;
    }

    private String tCredentialsUsername(TweetUser tweetUser) {

        if ( tweetUser == null ) {
            return null;
        }
        Credentials credentials = tweetUser.getCredentials();
        if ( credentials == null ) {
            return null;
        }
        String username = credentials.getUsername();
        if ( username == null ) {
            return null;
        }
        return username;
    }

    private String tCredentialsUsername_(TweetUser tweetUser) {

        if ( tweetUser == null ) {
            return null;
        }
        Credentials credentials = tweetUser.getCredentials();
        if ( credentials == null ) {
            return null;
        }
        String username = credentials.getUsername();
        if ( username == null ) {
            return null;
        }
        return username;
    }
}
