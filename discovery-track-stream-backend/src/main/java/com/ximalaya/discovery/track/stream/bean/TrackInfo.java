package com.ximalaya.discovery.track.stream.bean;

import org.apache.solr.client.solrj.beans.Field;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrackInfo {

    public TrackInfo() {

    }

    @Field("id")
    private Long id=0L;
    @Field("uid")
    private Long uid=0L;
    @Field("is_public")
    private int is_public=-1;
    @Field("user_source")
    private int user_source=-1;
    @Field("category_id")
    private int category_id=-1;
    @Field("tags")
    private List<String> tags=new ArrayList<>();
    @Field("title")
    private String title="";
    @Field("intro")
    private String intro="";
    @Field("cover_path")
    private String cover_path="";
    @Field("duration")
    private float duration=0.0f;
    @Field("album_id")
    private Long album_id=0L;
    @Field("created_at")
    private Date created_at = new Date();
    @Field("updated_at")
    private Date updated_at = new Date();
    @Field("is_deleted")
    private int is_deleted=-1;
    @Field("status")
    private int status=-1;
    @Field("album_title")
    private String album_title="";
    @Field("dig_status")
    private int dig_status=-1;
    @Field("is_paid")
    private int is_paid=-1;
    @Field("play_path")
    private String play_path="";

    @Field("nickname")
    private String nickname="";

    //thrift
    private boolean is_crawler=false;  //不放到索引里面，和 线上索引保持一致
    private List<String> pictures = new ArrayList<>();  //声音的多个图片
    private int album_status=-1;  //专辑的状态

    @Field("offline_type")
    private int offline_type=-1;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getUid() {
        return uid;
    }
    public void setUid(Long uid) {
        this.uid = uid;
    }
    public int getIs_public() {
        return is_public;
    }
    public void setIs_public(int is_public) {
        this.is_public = is_public;
    }
    public int getUser_source() {
        return user_source;
    }
    public void setUser_source(int user_source) {
        this.user_source = user_source;
    }
    public int getCategory_id() {
        return category_id;
    }
    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
    public List<String> getTags() {
        return tags;
    }
    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getIntro() {
        return intro;
    }
    public void setIntro(String intro) {
        this.intro = intro;
    }
    public String getCover_path() {
        return cover_path;
    }
    public void setCover_path(String cover_path) {
        this.cover_path = cover_path;
    }
    public float getDuration() {
        return duration;
    }
    public void setDuration(float duration) {
        this.duration = duration;
    }
    public boolean is_crawler() {
        return is_crawler;
    }
    public void setIs_crawler(boolean is_crawler) {
        this.is_crawler = is_crawler;
    }
    public Long getAlbum_id() {
        return album_id;
    }
    public void setAlbum_id(Long album_id) {
        this.album_id = album_id;
    }
    public Date getCreated_at() {
        return created_at;
    }
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
    public Date getUpdated_at() {
        return updated_at;
    }
    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
    public int getIs_deleted() {
        return is_deleted;
    }
    public void setIs_deleted(int is_deleted) {
        this.is_deleted = is_deleted;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getAlbum_title() {
        return album_title;
    }
    public void setAlbum_title(String album_title) {
        this.album_title = album_title;
    }
    public int getDig_status() {
        return dig_status;
    }
    public void setDig_status(int dig_status) {
        this.dig_status = dig_status;
    }
    public int getIs_paid() {
        return is_paid;
    }
    public void setIs_paid(int is_paid) {
        this.is_paid = is_paid;
    }
    public String getPlay_path() {
        return play_path;
    }
    public void setPlay_path(String play_path) {
        this.play_path = play_path;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<String> getPictures() {
        return pictures;
    }

    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }

    public int getAlbum_status() {
        return album_status;
    }

    public void setAlbum_status(int album_status) {
        this.album_status = album_status;
    }

    public int getOffline_type() {
        return offline_type;
    }

    public void setOffline_type(int offline_type) {
        this.offline_type = offline_type;
    }

}
