package academy.devdojo.springbootessentials2.mapper;

import academy.devdojo.springbootessentials2.domain.Anime;
import academy.devdojo.springbootessentials2.requests.AnimePostRequestBody;
import academy.devdojo.springbootessentials2.requests.AnimePutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public abstract class AnimeMapper {
    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);

    public abstract Anime toAnime(AnimePutRequestBody animePutRequestBody);

}
