package com.ximalaya.discovery.track.stream.bean;

/**
 * Created by nali on 16/12/16.
 */
public class AlbumQuery {
    String id;
    String uid;
    String is_finished;
    String title;
    String intro;
    String status;
    String is_deleted;
    String is_public;
    String is_paid;
    String upload_source;
    String user_source;
    String category_id;
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

    public String getIs_finished() {
        return is_finished;
    }

    public void setIs_finished(String is_finished) {
        this.is_finished = is_finished;
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

    public String getUpload_source() {
        return upload_source;
    }

    public void setUpload_source(String upload_source) {
        this.upload_source = upload_source;
    }

    public String getUser_source() {
        return user_source;
    }

    public void setUser_source(String user_source) {
        this.user_source = user_source;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    @Override
    public String toString() {
        return "AlbumQuery{" +
                "id='" + id + '\'' +
                ", uid='" + uid + '\'' +
                ", is_finished='" + is_finished + '\'' +
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
                ", upload_source=" + upload_source +
                '}';
    }
}
