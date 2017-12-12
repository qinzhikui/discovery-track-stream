

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by nali on 16/12/19.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"/application-context.xml"})
public class SolrServiceTest {

    @Test
    public void test() throws Exception{
        CloudSolrClient cloudSolrClient=new CloudSolrClient.Builder().withZkHost("192.168.3.50:2181/solr").build();
        String stringQuery="title: 香港 AND status:2 AND is_paid:0 AND offline_type:0";
        SolrQuery query = new SolrQuery();
        query.setQuery(stringQuery);
        query.set("collection", "track");
        QueryResponse response = cloudSolrClient.query(query);
        System.out.println(response);
    }
}
