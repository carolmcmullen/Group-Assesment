package com.cooksys.secondassessment.mapper;

import com.cooksys.secondassessment.dto.HashTagNoIdDto;
import com.cooksys.secondassessment.entity.HashTag;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-07-10T21:12:47-0500",
    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
@Component
public class HashTagMapperImpl implements HashTagMapper {

    @Override
    public HashTagNoIdDto hashTagNoIdDto(HashTag t) {
        if ( t == null ) {
            return null;
        }

        HashTagNoIdDto hashTagNoIdDto = new HashTagNoIdDto();

        hashTagNoIdDto.setFirstUsed( t.getFirstUsed() );
        hashTagNoIdDto.setLastUsed( t.getLastUsed() );
        hashTagNoIdDto.setLabel( t.getLabel() );

        return hashTagNoIdDto;
    }

    @Override
    public HashTag toHashTag(HashTagNoIdDto t) {
        if ( t == null ) {
            return null;
        }

        HashTag hashTag = new HashTag();

        hashTag.setLabel( t.getLabel() );
        hashTag.setFirstUsed( t.getFirstUsed() );
        hashTag.setLastUsed( t.getLastUsed() );

        return hashTag;
    }
}
