package com.kabasakalis.springifyapi.serializers;

import com.kabasakalis.springifyapi.domain.Artist;

public class ArtistResource extends BaseResourceSupport {

    public long id;
    public String name;
    public String  genre;
    public String country;
    public  int  albums_count;
    public String created_date;
    public String updated_date;

    public ArtistResource(Artist artist){
        super(artist);
        id = artist.getId();
        name = artist.getName();
        genre = artist.getGenre().getName();
        country = artist.getCountry();
        albums_count = artist.getAlbums().size();
        created_date = artist.getFormattedCreatedDate();
        updated_date = artist.getFormattedUpdatedDate();
    }

}