package com.ximalaya.discovery.track.stream.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;

import org.springframework.stereotype.Service;

import com.ximalaya.discovery.track.stream.bean.AlbumInfo;
import com.ximalaya.discovery.track.stream.bean.AlbumResult;


/**
 * Created by nali on 16/12/7.
 * 专辑服务
 * 1、根据SolrQuery查询索引，生成List<AlbumInfo>
 * 2、对于索引中没有的字段，调用服务查询，而后封装
 */
@Service
public class AlbumService extends SolrService{

    private static Logger logger = Logger.getLogger(AlbumService.class);


    public AlbumResult searchbySolrQuery(SolrQuery query){
        List<AlbumInfo> list = null;
        long numFound = 0L;
        try {
            //solr查询
            QueryResponse response = cloudSolrClient.query(query);
            numFound = response.getResults().getNumFound();
            list = response.getBeans(AlbumInfo.class);

        } catch (SolrServerException e) {
            logger.error("solr查询方法 cloudSolrClient.query() 调用错误！",e);
        } catch (IOException e) {
            logger.warn(query+e.getMessage());
        }
        int size = query.getRows();
        //调用查询
        int maxPage = (int) Math.ceil(numFound*1.0/size);

        AlbumResult albumResult = new AlbumResult(maxPage,list,Long.valueOf(numFound).intValue());
        return albumResult;
    }

}
