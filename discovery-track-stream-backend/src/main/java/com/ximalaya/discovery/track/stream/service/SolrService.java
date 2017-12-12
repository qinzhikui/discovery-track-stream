package com.ximalaya.discovery.track.stream.service;

import org.apache.log4j.Logger;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * Created by nali on 16/12/19.
 * 加载配置文件，做初始化操作
 */
@Component
public class SolrService implements InitializingBean {

    Logger logger = Logger.getLogger(SolrService.class);

    @Value("#{solr['SOLR_URL']}")
    public String SOLR_URL = "192.168.3.50:2181/solr";

    CloudSolrClient cloudSolrClient;

    @Override
    public void afterPropertiesSet() throws Exception {
        cloudSolrClient = new CloudSolrClient.Builder().withZkHost(SOLR_URL).build();
    }

}
