package com.cooksys.secondassessment.mapper;

import com.cooksys.secondassessment.dto.ProfileDto;
import com.cooksys.secondassessment.dto.ProfileEmailOnlyDto;
import com.cooksys.secondassessment.entity.Profile;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-07-10T21:12:47-0500",
    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
@Component
public class ProfileMapperImpl implements ProfileMapper {

    @Override
    public ProfileDto tProfileDto(Profile p) {
        if ( p == null ) {
            return null;
        }

        ProfileDto profileDto = new ProfileDto();

        profileDto.setFirstName( p.getFirstName() );
        profileDto.setLastName( p.getLastName() );
        profileDto.setEmail( p.getEmail() );
        profileDto.setPhone( p.getPhone() );

        return profileDto;
    }

    @Override
    public Profile toProfile(ProfileDto p) {
        if ( p == null ) {
            return null;
        }

        Profile profile = new Profile();

        profile.setFirstName( p.getFirstName() );
        profile.setLastName( p.getLastName() );
        profile.setEmail( p.getEmail() );
        profile.setPhone( p.getPhone() );

        return profile;
    }

    @Override
    public ProfileEmailOnlyDto tEmailOnlyDto(Profile p) {
        if ( p == null ) {
            return null;
        }

        ProfileEmailOnlyDto profileEmailOnlyDto = new ProfileEmailOnlyDto();

        profileEmailOnlyDto.setEmail( p.getEmail() );

        return profileEmailOnlyDto;
    }

    @Override
    public Profile toProfile(ProfileEmailOnlyDto p) {
        if ( p == null ) {
            return null;
        }

        Profile profile = new Profile();

        profile.setEmail( p.getEmail() );

        return profile;
    }
}
