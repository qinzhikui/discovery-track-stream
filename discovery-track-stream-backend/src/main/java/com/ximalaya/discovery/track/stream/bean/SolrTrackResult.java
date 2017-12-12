package com.ximalaya.discovery.track.stream.bean;

public class SolrTrackResult{

    private long category_id;
    private String category_title;
    private float album_score;
    private boolean is_wrap;
    private long album_id;
    private String album_title;
    private long track_id;
    private String track_title;
    private String upload_time_begin;
    private String upload_time_end;
    private boolean is_wrap_picture;
    private boolean is_context_related;



    public long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(long category_id) {
        this.category_id = category_id;
    }

    public String getCategory_title() {
        return category_title;
    }

    public void setCategory_title(String category_title) {
        this.category_title = category_title;
    }

    public float getAlbum_score() {
        return album_score;
    }

    public void setAlbum_score(float album_score) {
        this.album_score = album_score;
    }

    public boolean isIs_wrap() {
        return is_wrap;
    }

    public void setIs_wrap(boolean is_wrap) {
        this.is_wrap = is_wrap;
    }

    public long getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(long album_id) {
        this.album_id = album_id;
    }

    public String getAlbum_title() {
        return album_title;
    }

    public void setAlbum_title(String album_title) {
        this.album_title = album_title;
    }

    public long getTrack_id() {
        return track_id;
    }

    public void setTrack_id(long track_id) {
        this.track_id = track_id;
    }

    public String getTrack_title() {
        return track_title;
    }

    public void setTrack_title(String track_title) {
        this.track_title = track_title;
    }

    public String getUpload_time_begin() {
        return upload_time_begin;
    }

    public void setUpload_time_begin(String upload_time_begin) {
        this.upload_time_begin = upload_time_begin;
    }

    public String getUpload_time_end() {
        return upload_time_end;
    }

    public void setUpload_time_end(String upload_time_end) {
        this.upload_time_end = upload_time_end;
    }

    public boolean isIs_wrap_picture() {
        return is_wrap_picture;
    }

    public void setIs_wrap_picture(boolean is_wrap_picture) {
        this.is_wrap_picture = is_wrap_picture;
    }

    public boolean isIs_context_related() {
        return is_context_related;
    }

    public void setIs_context_related(boolean is_context_related) {
        this.is_context_related = is_context_related;
    }

    @Override
    public String toString() {
        return "SolrTrackResult{" +
                "category_id=" + category_id +
                ", category_title='" + category_title + '\'' +
                ", album_score=" + album_score +
                ", is_wrap=" + is_wrap +
                ", album_id=" + album_id +
                ", album_title='" + album_title + '\'' +
                ", track_id=" + track_id +
                ", track_title='" + track_title + '\'' +
                ", upload_time_begin='" + upload_time_begin + '\'' +
                ", upload_time_end='" + upload_time_end + '\'' +
                ", is_wrap_picture=" + is_wrap_picture +
                ", is_context_related=" + is_context_related +
                '}';
    }

}