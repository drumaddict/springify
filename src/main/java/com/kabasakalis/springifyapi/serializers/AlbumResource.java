package com.kabasakalis.springifyapi.serializers;

import com.kabasakalis.springifyapi.domain.Album;

public class AlbumResource extends BaseResourceSupport {

    public long id;
    public String title;
    public String year;
    public String created_date;
    public String updated_date;

    public AlbumResource(Album album) {
        super(album);
        id = album.getId();
        title = album.getTitle();
        year = album.getYear();
        created_date = album.getFormattedCreatedDate();
        updated_date = album.getFormattedUpdatedDate();
    }

}