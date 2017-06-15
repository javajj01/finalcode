package com.baizhi.service.impl;

import com.baizhi.dao.UserMapper;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.baizhi.util.Utils;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by asus on 2017/6/15.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;


    public User add(User user) {
        User user1 = userMapper.selectByPhone(user.getPhone());
        if(user1!=null){
            return user1;
        }
        user.setId(Utils.getSnowFlake());
        user.setMoney(0.0);
        user.setName(Utils.getSnowFlake());
        userMapper.insert(user);
        return user;

    }


    public String phonecode(String phone) throws Exception {


                String url="http://gw.api.taobao.com/router/rest";
               String appkey="23755497";
               String secret="a4f3bea7773419c4e9633008eb91a756";
               TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
                AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
                req.setExtend("123456");
                 req.setSmsType("normal");
                req.setSmsFreeSignName("小白猪哥哥");
                String salt = Utils.getsalt();
                req.setSmsParamString("{\"code\":\""+salt+"\"}");
                req.setRecNum(phone);
                req.setSmsTemplateCode("SMS_62205270");
                AlibabaAliqinFcSmsNumSendResponse rsp =(AlibabaAliqinFcSmsNumSendResponse) client.execute(req);

        return salt;
    }

    //查看一个用户所收藏的律师
    public User selectFavorite(String id) {
        User user = userMapper.selectfavorite(id);
        return user;
    }

    public void addfavorite(String id, String lid) {
        userMapper.addFavorite(id,lid);
    }

    public User queryByid(String id) {
        User user = userMapper.selectById(id);
        return user;
    }

    //添加一个收藏
    public void addFavorite(String id,String lid){
        userMapper.addFavorite(id,lid);
    }
}
