package com.ximalaya.discovery.track.stream.bean;

import java.util.List;

/**
 * Created by nali on 16/12/16.
 */
public class AlbumResult {
    private int maxPage;
    private List<AlbumInfo> albumInfoList;
    private int maxSize;

    public AlbumResult(int maxPage, List<AlbumInfo> albumInfoList,int maxSize) {
        this.maxPage = maxPage;
        this.albumInfoList = albumInfoList;
        this.maxSize=maxSize;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public void setMaxPage(int maxPage) {
        this.maxPage = maxPage;
    }

    public List<AlbumInfo> getAlbumInfoList() {
        return albumInfoList;
    }

    public void setAlbumInfoList(List<AlbumInfo> albumInfoList) {
        this.albumInfoList = albumInfoList;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
}
