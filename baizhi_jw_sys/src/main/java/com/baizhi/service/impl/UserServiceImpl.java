package com.baizhi.service.impl;

import com.baizhi.dao.UserMapper;
import com.baizhi.entity.Lawer;
import com.baizhi.entity.Order;
import com.baizhi.entity.Redpackage;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.baizhi.vo.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by asus on 2017/6/14.
 */
@Service("userService")
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class UserServiceImpl implements UserService{


    @Autowired
    private UserMapper userMapper;


    public Paging<User> queryAll(int page,int rows) {
        Page<User> pages = PageHelper.startPage(page, rows);
        userMapper.selectAll();
        Paging<User> userPaging = new Paging<User>();
        userPaging.setTotal((int) pages.getTotal());
        userPaging.setRows(pages.getResult());
        return userPaging;
    }

    public List<UserOrder> queryOrder(String id) {
        User user = userMapper.selectOrder(id);
        List<Order> orders = user.getOrders();
        ArrayList<UserOrder> li = new ArrayList<UserOrder>();
        for (Order order : orders) {
            UserOrder uo = new UserOrder();
            uo.setOid(order.getId());
            uo.setUid(user.getId());
            uo.setStatus(order.getStatus());
            uo.setUsername(user.getName());
            uo.setLid(order.getLawer().getId());
            uo.setLawername(order.getLawer().getName());
            if(order.getComment()==null){
                uo.setComment("订单未完成暂无评价");
            }else{
            uo.setComment(order.getComment().getContent());
            }
            uo.setOrdercontent(order.getContent());
            li.add(uo);
        }
        return li;
    }

    public List<UserRedpackage> queryRedpackage(String id) {
        User user = userMapper.selectRedPackage(id);
        List<Redpackage> redpackages= user.getRedpackages();
        ArrayList<UserRedpackage> li = new ArrayList<UserRedpackage>();
        for (Redpackage redpackage : redpackages) {
            UserRedpackage ur = new UserRedpackage();
            ur.setId(user.getId());
            ur.setUsername(user.getName());
            ur.setLawername(redpackage.getLawer().getName());
            ur.setLawerid(redpackage.getLawer().getId());
            ur.setContent(redpackage.getContent());
            ur.setRedpackage(redpackage.getRedpackage());
            li.add(ur);
        }
        return li;
    }

    public List<UserLawer> queryLawer(String id) {
        User user = userMapper.selectfavorite(id);
        List<Lawer> lawers = user.getLawers();
        ArrayList<UserLawer> li = new ArrayList<UserLawer>();
        for (Lawer lawer : lawers) {
            UserLawer ul = new UserLawer();
            ul.setUid(user.getId());
            ul.setUsername(user.getName());
            ul.setLid(lawer.getId());
            ul.setLawername(lawer.getName());
            ul.setLaweraddress(lawer.getAddress());
            ul.setLawerphone(lawer.getPhone());
            li.add(ul);
        }
        return li;
    }

    public RedpackageCounts queryAllUserCount() {
        List<User> list = userMapper.selectAll();
        ArrayList<String> strs = new ArrayList<String>();
        ArrayList<Integer> ints = new ArrayList<Integer>();
        for (User user : list) {
            User user1 = userMapper.selectUserCount(user.getId());
            strs.add(user1.getName());
            Integer count = user1.getCount();
            ints.add(count);
        }
        RedpackageCounts rc= new RedpackageCounts();
        rc.setUsers(strs);
        rc.setData(ints);


        return rc;
    }
}
