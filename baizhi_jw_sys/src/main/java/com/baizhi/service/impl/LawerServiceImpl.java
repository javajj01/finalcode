package com.baizhi.service.impl;

import com.baizhi.dao.LawerMapper;
import com.baizhi.entity.Comment;
import com.baizhi.entity.Lawer;
import com.baizhi.entity.Lawertype;
import com.baizhi.entity.Redpackage;
import com.baizhi.service.LawerService;
import com.baizhi.util.Utils;
import com.baizhi.vo.LawerComment;
import com.baizhi.vo.LawerLawerType;
import com.baizhi.vo.LawerRedPackage;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 2017/6/12.
 */
@Service("lawerService")
@Transactional
public class LawerServiceImpl implements LawerService {

    @Autowired
    private LawerMapper lawerMapper;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Page<Lawer> queryAll(int page, int rows) {
        Page<Lawer> pages = PageHelper.startPage(page, rows);
        lawerMapper.selectAll();
        return pages;
    }

    public void add(Lawer lawer) {
        lawer.setId(Utils.getSnowFlake());
        lawerMapper.insert(lawer);
        List<Lawertype> lawertypes = lawer.getLawertypes();
        for (Lawertype lawertype : lawertypes) {
            lawerMapper.addlawerandtypeid(lawer.getId(),lawertype.getId());
        }
    }

    public void delete(String id) {
        lawerMapper.deletelawerandtypeid(id);
        lawerMapper.deleteByPrimaryKey(id);
    }

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<LawerRedPackage> queryLawerRedPackage(String id) {
        Lawer lawer = lawerMapper.selectLawerRedPackage(id);
        List<Redpackage> redpackages = lawer.getRedpackages();
        ArrayList<LawerRedPackage> li = new ArrayList<LawerRedPackage>();
        for (Redpackage redpackage : redpackages) {
            LawerRedPackage lawerRedPackage = new LawerRedPackage();
            lawerRedPackage.setId(lawer.getId());
            lawerRedPackage.setName(lawer.getName());
            lawerRedPackage.setUsername(redpackage.getUser().getName());
            lawerRedPackage.setMoney(redpackage.getRedpackage());
            lawerRedPackage.setContent(redpackage.getContent());
            li.add(lawerRedPackage);
        }
        return li;
    }

    public List<LawerLawerType> queryLawerLawerType(String id) {
        Lawer lawer = lawerMapper.selectLawerType(id);
        List<Lawertype> lawertypes = lawer.getLawertypes();
        ArrayList<LawerLawerType> li = new ArrayList<LawerLawerType>();
        for (Lawertype lawertype : lawertypes) {
            LawerLawerType llt = new LawerLawerType();
            llt.setId(lawer.getId());
            llt.setName(lawer.getName());
            llt.setTypename(lawertype.getName());
            li.add(llt);
        }

        return li;
    }

    public List<LawerComment> queryLawerComment(String id) {
        Lawer lawer = lawerMapper.selectLawerComment(id);

        List<Comment> comments = lawer.getComments();
        ArrayList<LawerComment> li= new ArrayList<LawerComment>();
        for (Comment comment : comments) {

            LawerComment lawerComment = new LawerComment();
            lawerComment.setId(lawer.getId());
            lawerComment.setName(lawer.getName());
            if(comment.getContent()==null){
                lawerComment.setContent("订单未完成 暂无评价");
            }else{
            lawerComment.setContent(comment.getContent());
            }

            lawerComment.setUsername(comment.getOrder().getUser().getName());
            lawerComment.setCreateTime(comment.getCreatetime());
            li.add(lawerComment);
        }

        return li;
    }
}
