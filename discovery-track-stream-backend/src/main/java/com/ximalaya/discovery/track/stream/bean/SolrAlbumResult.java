package com.ximalaya.discovery.track.stream.bean;

public class SolrAlbumResult{

    private int category_id;
    private String category_title;
    private float album_score;
    private boolean is_wrap;
    private long id;
    private String title;

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "SolrResult{" +
                "category_id=" + category_id +
                ", category_title='" + category_title + '\'' +
                ", album_score=" + album_score +
                ", is_wrap=" + is_wrap +
                ", id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}