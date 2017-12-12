package com.ximalaya.discovery.track.stream.bean;

/**
 * Created by nali on 16/12/16.
 */
public class TrackQuery {
    String id;
    String uid;
    String album_id;
    String title;
    String intro;
    String status;
    String is_deleted;
    String is_public;
    String is_paid;
    String create_time_start;
    String create_time_end;

    int page = 1;
    int size = 3;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(String album_id) {
        this.album_id = album_id;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(String is_deleted) {
        this.is_deleted = is_deleted;
    }

    public String getIs_public() {
        return is_public;
    }

    public void setIs_public(String is_public) {
        this.is_public = is_public;
    }

    public String getIs_paid() {
        return is_paid;
    }

    public void setIs_paid(String is_paid) {
        this.is_paid = is_paid;
    }

    public String getCreate_time_start() {
        return create_time_start;
    }

    public void setCreate_time_start(String create_time_start) {
        this.create_time_start = create_time_start;
    }

    public String getCreate_time_end() {
        return create_time_end;
    }

    public void setCreate_time_end(String create_time_end) {
        this.create_time_end = create_time_end;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "AlbumQuery{" +
                "id='" + id + '\'' +
                ", uid='" + uid + '\'' +
                ", album_id='" + album_id + '\'' +
                ", title='" + title + '\'' +
                ", intro='" + intro + '\'' +
                ", status='" + status + '\'' +
                ", is_deleted='" + is_deleted + '\'' +
                ", is_public='" + is_public + '\'' +
                ", is_paid='" + is_paid + '\'' +
                ", create_time_start='" + create_time_start + '\'' +
                ", create_time_end='" + create_time_end + '\'' +
                ", page=" + page +
                ", size=" + size +
                '}';
    }
}
