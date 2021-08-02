package com.my;

import org.apache.http.HttpHost;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.client.indices.GetIndexResponse;

import java.io.IOException;

/**
 * @Author: yiqiang
 * @Date: 2021/7/25 21:15
 * @Description:
 */
public class EsTest {
    public static void main(String[] args) throws IOException {
        //创建es客户端
        RestHighLevelClient esclient = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost",9200,"http"))
        );


        //创建索引
        /*CreateIndexRequest users = new CreateIndexRequest("users");
        CreateIndexResponse response = esclient.indices().create(users, RequestOptions.DEFAULT);
        boolean acknowledged = response.isAcknowledged();
        System.out.println(acknowledged);*/

        //查询索引
        /*GetIndexRequest users1 = new GetIndexRequest("users");
        GetIndexResponse getIndexResponse = esclient.indices().get(users1, RequestOptions.DEFAULT);
        System.out.println(getIndexResponse.getAliases());
        System.out.println(getIndexResponse.getMappings());
        System.out.println(getIndexResponse.getSettings());*/

        //删除索引
        /*AcknowledgedResponse users = esclient.indices().delete(new DeleteIndexRequest("users"), RequestOptions.DEFAULT);
        System.out.println(users.isAcknowledged());*/

        //
        /////
        //aaa

        //xxxx


        //关闭es
        esclient.close();
    }
}
