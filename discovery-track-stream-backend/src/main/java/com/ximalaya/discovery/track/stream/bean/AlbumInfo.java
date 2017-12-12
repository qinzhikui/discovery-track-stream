package com.ximalaya.discovery.track.stream.bean;

import org.apache.solr.client.solrj.beans.Field;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlbumInfo {

    @Field("id")
    private Long id=0L; //
    @Field("uid")
    private Long uid=0L; //
    @Field("is_public")
    private int is_public=-1; //
    @Field("user_source")
    private int user_source=-1;
    @Field("category_id")
    private int category_id=-1; //
    @Field("tags")
    private List<String> tags = new ArrayList<>(); //
    @Field("title")
    private String title=""; //
    @Field("intro")
    private String intro=""; //
    @Field("cover_path")
    private String cover_path=""; //
    @Field("created_at")
    private Date created_at = new Date(); //
    @Field("status")
    private int status=-1; //
    @Field("is_deleted")
    private int is_deleted=-1; //
    @Field("is_paid")
    private int is_paid=-1; //
    @Field("updated_at")
    private Date updated_at = new Date(); //
    @Field("is_finished")
    private int is_finished=-1; //

    //not in tb_album
    @Field("dig_status")
    private int dig_status=-1;
    @Field("nickname")
    private String nickname="";

    @Field("offline_type")
    private int offline_type=-1;
    @Field("upload_source")
    private Integer upload_source=-1;

    private boolean is_crawler=true;
    private int list_items_relationship=-1;

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

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(int is_deleted) {
        this.is_deleted = is_deleted;
    }

    public int getIs_paid() {
        return is_paid;
    }

    public void setIs_paid(int is_paid) {
        this.is_paid = is_paid;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public int getIs_finished() {
        return is_finished;
    }

    public void setIs_finished(int is_finished) {
        this.is_finished = is_finished;
    }

    public int getDig_status() {
        return dig_status;
    }

    public void setDig_status(int dig_status) {
        this.dig_status = dig_status;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getOffline_type() {
        return offline_type;
    }

    public void setOffline_type(int offline_type) {
        this.offline_type = offline_type;
    }

    public boolean is_crawler() {
        return is_crawler;
    }

    public void setIs_crawler(boolean is_crawler) {
        this.is_crawler = is_crawler;
    }

    public int getList_items_relationship() {
        return list_items_relationship;
    }

    public void setList_items_relationship(int list_items_relationship) {
        this.list_items_relationship = list_items_relationship;
    }

    public Integer getUpload_source() {
        return upload_source;
    }

    public void setUpload_source(Integer upload_source) {
        this.upload_source = upload_source;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        return "AlbumInfo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", created_at=" + sdf.format(created_at) +
                '}';
    }

}
