package com.ximalaya.discovery.track.stream.bean;

import java.util.List;

/**
 * Created by nali on 16/12/16.
 */
public class TrackResult {
    private int maxPage;
    private List<TrackInfo> trackInfoList;
    private int maxSize;

    public TrackResult(int maxPage, List<TrackInfo> trackInfoList, int maxSize) {
        this.maxPage = maxPage;
        this.trackInfoList = trackInfoList;
        this.maxSize = maxSize;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public void setMaxPage(int maxPage) {
        this.maxPage = maxPage;
    }

    public List<TrackInfo> getTrackInfoList() {
        return trackInfoList;
    }

    public void setTrackInfoList(List<TrackInfo> trackInfoList) {
        this.trackInfoList = trackInfoList;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
}
