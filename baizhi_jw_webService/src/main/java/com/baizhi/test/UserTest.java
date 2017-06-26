package com.baizhi.test;

import com.alibaba.fastjson.JSONObject;
import com.baizhi.entity.Lawer;
import com.baizhi.entity.Redpackage;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.apache.commons.codec.language.bm.Rule;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.StringEntity;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * Created by asus on 2017/6/15.
 */
public class UserTest {

    @Test
    public void test1() throws IOException {
        Redpackage rp = new Redpackage();
        Lawer lawer = new Lawer();
        lawer.setId("12");
        User user = new User();
        user.setId("1");
        rp.setLawer(lawer);
        rp.setUser(user);
        rp.setRedpackage(new BigDecimal(30));
        rp.setContent("还挺不错");
        String str = JSONObject.toJSONString(rp);
        StringEntity stringEntity = new StringEntity(str,"utf-8");
        String s = Request.Post("http://localhost:8989/baizhi_jw_webService/web/jw/jw/addRedpackage")
                .body(stringEntity).setHeader("content-type","application/json;charset=utf-8").execute().returnContent().asString();
        System.out.println(s);

        }
}
